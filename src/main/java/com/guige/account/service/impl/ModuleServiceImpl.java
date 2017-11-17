package com.guige.account.service.impl;


import com.guige.base.exception.BusinessException;
import com.guige.account.mapper.ModuleExMapper;
import com.guige.account.mapper.ModuleMapper;
import com.guige.account.pojo.constant.CodeConstant;
import com.guige.account.pojo.entity.Module;
import com.guige.account.pojo.entity.RoleMod;
import com.guige.account.pojo.vo.ModuleVo;
import com.guige.account.service.ModuleService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Anwei.S
 * @CreateDate 2017年2月14日 下午1:43:01
 * @Description:模块service
 */
@Transactional
@Service("moduleService")
public class ModuleServiceImpl implements ModuleService {
	@Autowired
	ModuleMapper moduleMapper;
	@Autowired
	ModuleExMapper moduleExMapper;

	@Override
	public Module createModule(ModuleVo module) {

		if (module == null || StringUtils.isBlank(module.getModuleName()) || StringUtils.isBlank(module.getModuleCd())
				|| StringUtils.isBlank(module.getServiceCd())) {
			throw new BusinessException("error.10008", this);
		}
		Module m = new Module();

		// 校验模块是否重复
		List<Module> resultList = checkModule(module.getServiceCd(), module.getModuleName(), module.getModuleCd());
		if (CollectionUtils.isNotEmpty(resultList)) {
			resultList.forEach(item -> {
				if (!item.getDeleteFlag()) {
					throw new BusinessException("error.10006", this);
				}
			});
			m = resultList.get(0);
		}
		// 如果以前存在并被删除了 那么重新复用该对象
		String uuid = m.getUuid();
		BeanUtils.copyProperties(module, m);
		if (StringUtils.isNoneBlank(uuid)) {
			m.setUuid(uuid);
			m.setDeleteFlag(false);
			m.setUpdateUser(module.getUpdateUser());
			m.setUpdateTime(module.getUpdateTime());
			moduleMapper.updateByPrimaryKey(m);
			return moduleMapper.selectByPrimaryKey(m.getUuid());
		}
		m.setInsertTime(new Date());
		m.setInsertUser(module.getInsertUser());
		m.setUpdateUser(module.getUpdateUser());
		m.setUpdateTime(module.getUpdateTime());
		int result = moduleMapper.insertSelective(m);
		if (result > 0) {
			return moduleMapper.selectByPrimaryKey(m.getUuid());
		} else {
			throw new BusinessException("error.10005", this);
		}
	}

	@Override
	public int deleteModule(List<String> moduleUuids) {
		if (CollectionUtils.isEmpty(moduleUuids)) {
			throw new BusinessException("error.10008", this);
		}
		ModuleVo moduleVo = new ModuleVo();
		moduleVo.setModuleUuids(moduleUuids);
		//moduleVo.setUpdateUser(module.getUpdateUser());
		moduleVo.setUpdateTime(new Date());
		return moduleExMapper.deleteModule(moduleVo);

	}

	@Override
	public int updateModule(ModuleVo module) {
		if (module == null || StringUtils.isBlank(module.getUuid())) {
			throw new BusinessException("error.10008", this);
		}
		// 校验角色名称是否重复
		List<Module> result = checkModule(module.getServiceCd(), module.getModuleName(), module.getModuleCd());
		if (CollectionUtils.isNotEmpty(result)) {
			if (result.size() != 1 || !result.get(0).getUuid().equals(module.getUuid())) {
				throw new BusinessException("error.10006", this);
			}
		}
		Module m = moduleMapper.selectByPrimaryKey(module.getUuid());
		if (m == null) {
			throw new BusinessException("error.1001", this);
		}
		m.setServiceCd(module.getServiceCd());
		m.setModuleCd(module.getModuleCd());
		m.setModuleName(module.getModuleName());
		m.setModuleUrl(module.getModuleUrl());
		m.setUpdateUser(module.getUpdateUser());
		m.setUpdateTime(module.getUpdateTime());

		return moduleMapper.updateByPrimaryKeySelective(m);
	}

	@Override
	public List<Module> findModules(String compUuid, String userUuid, String roleUuid) {

		return moduleExMapper.findModulesByUserOrRole(compUuid, userUuid, roleUuid, CodeConstant.YES);
	}
	
	@Override
	public List<RoleMod> findModules(String compUuid, String userUuid) {

		List<RoleMod> modules = moduleExMapper.findModulesByUser(compUuid, userUuid);
		Set<RoleMod> modDisabled = modules.stream().filter(mod -> !mod.getEnable()).collect(Collectors.toSet());
		if (modDisabled.isEmpty())
			return modules;
		
		List<RoleMod> roleMods = new ArrayList<>();
		for (RoleMod module : modules) {
			boolean disabled = false;
			for (RoleMod modDis : modDisabled) {
				if (module.getModuleUuid().equals(modDis.getModuleUuid())) {
					disabled = true;
					break;
				}
			}
			if (!disabled)
				roleMods.add(module);
		}
		return roleMods;
	}
	

	@Override
	public List<Module> findModulesAllByUser(String compUuid, String userUuid) {
		return moduleExMapper.findModulesByUserOrRole(compUuid, userUuid, null, null);
	}

	@Override
	public List<Module> findModulesAllByComp(String compUuid) {
		return moduleExMapper.findModulesByUserOrRole(compUuid, null, null, null);
	}

	@Override
	public List<Module> checkModuleServiceCd(String serviceCd) {
		return checkModule(serviceCd, null, null);
	}

	@Override
	public List<Module> checkModuleModuleName(String moduleName) {
		return checkModule(null, moduleName, null);
	}

	@Override
	public List<Module> checkModuleModuleCd(String moduleCd) {
		return checkModule(null, null, moduleCd);
	}

	private List<Module> checkModule(String serviceCd, String moduleName, String moduleCd) {
		// 校验模块是否重复
		return moduleExMapper.checkModule(serviceCd, moduleName, moduleCd);

	}

	@Override
	public Map<String, String> findModulesUrl() {
		Map<String, String> urlMap = new HashMap<>();
		List<Module> modules = moduleExMapper.findModules(new ModuleVo());
		if (CollectionUtils.isNotEmpty(modules)) {
			urlMap = modules.stream().filter(m-> StringUtils.isNoneBlank(m.getModuleUrl())).
					collect(Collectors.toMap(Module::getModuleUrl, m->m.getServiceCd()+":"+m.getModuleCd()));
		}
		return urlMap;
	}

}
