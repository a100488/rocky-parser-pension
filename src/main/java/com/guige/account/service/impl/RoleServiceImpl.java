package com.guige.account.service.impl;

import com.guige.base.exception.BusinessException;
import com.guige.account.mapper.*;
import com.guige.account.pojo.entity.Role;
import com.guige.account.pojo.entity.RoleMod;
import com.guige.account.pojo.entity.UserRole;
import com.guige.account.pojo.vo.RoleVo;
import com.guige.account.service.RoleService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Anwei.S
 * @CreateDate 2017年2月15日 下午3:27:56
 * @Description:
 */
@Transactional
@Service("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleMapper roleMapper;
	@Autowired
	RoleExMapper roleExMapper;
	@Autowired
	RoleModExMapper roleModExMapper;
	@Autowired
	RoleModMapper roleModMapper;
	@Autowired
	UserRoleExMapper userRoleExMapper;

	@Override
	public Role createRole(RoleVo role) {
		if (role == null || StringUtils.isBlank(role.getRoleName()) || StringUtils.isBlank(role.getCompUuid())) {
			throw new BusinessException("error.10008", this);
		}
		// 校验角色名称是否重复
		RoleVo searchRoleVo = new RoleVo();
		searchRoleVo.setCompUuid(role.getCompUuid());
		searchRoleVo.setRoleName(role.getRoleName());
		if (CollectionUtils.isNotEmpty(roleExMapper.findRoles(searchRoleVo))) {
			throw new BusinessException("error.10006", this);
		}
		Role r = new Role();
		BeanUtils.copyProperties(role, r);

		//r.buildForInsert();
		int result = roleMapper.insertSelective(r);
		if(result>0){
			return roleMapper.selectByPrimaryKey(r.getUuid());
		}else{
			throw new BusinessException("error.10005", this);
		}
	}

	@Override
	public List<Role> checkRoleName(String compUuid, String roleName) {
		RoleVo roleVo = new RoleVo();
		roleVo.setCompUuid(compUuid);
		roleVo.setRoleName(roleName);
		return roleExMapper.findRoles(roleVo);
	}

	@Override
	public int deleteRole(List<String> roleUuids) {
		if (CollectionUtils.isEmpty(roleUuids)) {
			throw new BusinessException("error.10008", this);
		}
		RoleVo roleVo = new RoleVo();
		//roleVo.buildForDel();
		roleVo.setRoleUuids(roleUuids);
		return roleExMapper.deleteRole(roleVo);
	}

	@Override
	public int updateRole(RoleVo role) {
		if (role == null || StringUtils.isBlank(role.getUuid())) {
			throw new BusinessException("error.10008", this);
		}
		// 校验角色名称是否重复
		List<Role> result = checkRoleName(role.getCompUuid(), role.getRoleName());
		if (CollectionUtils.isNotEmpty(result)) {
			if(result.size()!=1||!result.get(0).getUuid().equals(role.getUuid())){
				throw new BusinessException("error.10006", this);
			}
		}
		Role r = roleMapper.selectByPrimaryKey(role.getUuid());
		if (r == null) {
			throw new BusinessException("error.1001", this);
		}
		r.setRoleLevel(role.getRoleLevel());
		r.setRoleName(role.getRoleName());
		r.setUpdateTime(new Date());
		r.setUpdateUser(role.getUpdateUser());
		//r.buildForUpdate();
		return roleMapper.updateByPrimaryKeySelective(r);
		
	}

	@Override
	public List<UserRole> findUserRoles(String compUuid, String userUuid) {
		UserRole urole = new UserRole();
		urole.setCompUuid(compUuid);
		urole.setUserUuid(userUuid);
		urole.setDeleteFlag(false);
		return userRoleExMapper.findUserRoles(urole);
	}
	
	@Override
	public List<Role> findRoles(String compUuid) {
		return roleExMapper.findRolesByCompUuid(null);
	}

	@Override
	public List<Role> getPredefineRoles() {
		return roleExMapper.getPredefineRoles();
	}
	@Override
	public List<Role> getEmplRoles() {
		return roleExMapper.getEmplRoles();
	}

	@Override
	public int correlationModules(String compUuid, String roleUuid, List<String> moduleUuids) {

		if (StringUtils.isBlank(compUuid) || StringUtils.isBlank(roleUuid) || CollectionUtils.isEmpty(moduleUuids)) {
			throw new BusinessException("error.10008", this);
		}
		moduleUuids = moduleUuids.stream().distinct().collect(Collectors.toList());
		RoleMod searchRoleMod = new RoleMod();
		searchRoleMod.setCompUuid(compUuid);
		searchRoleMod.setRoleUuid(roleUuid);
		List<RoleMod> roleModList = roleModExMapper.findRoleMods(searchRoleMod);
		Map<String, RoleMod> roleModMap = null;
		if (CollectionUtils.isNotEmpty(roleModList)) {
			roleModMap = roleModList.stream().collect(Collectors.toMap(RoleMod::getModuleUuid, roleMod -> roleMod));
		}
		for (int i = 0; i < moduleUuids.size(); i++) {
			if (roleModMap != null && roleModMap.get(moduleUuids.get(i)) != null) {
				RoleMod roleMod = roleModMap.get(moduleUuids.get(i));
				if (roleMod.getDeleteFlag()) {
					roleMod.setUpdateTime(new Date());
					roleMod.setDeleteFlag(false);
					roleMod.setEnable(true);
					roleModMapper.updateByPrimaryKey(roleMod);
				}
			} else {
				RoleMod roleMod = new RoleMod();
				roleMod.setCompUuid(compUuid);
				roleMod.setModuleUuid(moduleUuids.get(i));
				roleMod.setRoleUuid(roleUuid);
				roleMod.setEnable(true);
				roleMod.setInsertTime(new Date());
				//roleMod.setInsertUser();
				roleModMapper.insert(roleMod);
			}
		}
		return 1;
	}

	@Override
	public int enabledModules(String compUuid, String roleUuid, List<String> moduleUuids, Boolean enabled) {

		if (StringUtils.isBlank(compUuid) || StringUtils.isBlank(roleUuid) || CollectionUtils.isEmpty(moduleUuids)||enabled == null) {
			throw new BusinessException("error.10008", this);
		}
		moduleUuids = moduleUuids.stream().distinct().collect(Collectors.toList());
		RoleMod searchRoleMod = new RoleMod();
		searchRoleMod.setCompUuid(compUuid);
		searchRoleMod.setRoleUuid(roleUuid);
		searchRoleMod.setDeleteFlag(false);
		List<RoleMod> roleModList = roleModExMapper.findRoleMods(searchRoleMod);
		Map<String, RoleMod> roleModMap = null;
		if (CollectionUtils.isNotEmpty(roleModList)) {
			roleModMap = roleModList.stream().collect(Collectors.toMap(RoleMod::getModuleUuid, roleMod -> roleMod));
		}
		for (int i = 0; i < moduleUuids.size(); i++) {
			if (roleModMap != null && roleModMap.get(moduleUuids.get(i)) != null) {
				RoleMod roleMod = roleModMap.get(moduleUuids.get(i));
				if (roleMod.getEnable() != enabled) {
					roleMod.setUpdateTime(new Date());
					roleMod.setEnable(enabled);
					roleModMapper.updateByPrimaryKey(roleMod);
				}
			}
		}
		return 1;
	}

	@Override
	public int uncorrelationModules(String compUuid, String roleUuid, List<String> moduleUuids) {

		if (StringUtils.isBlank(compUuid) || StringUtils.isBlank(roleUuid) || CollectionUtils.isEmpty(moduleUuids)) {
			throw new BusinessException("error.10008", this);
		}
		moduleUuids = moduleUuids.stream().distinct().collect(Collectors.toList());
		RoleMod searchRoleMod = new RoleMod();
		searchRoleMod.setCompUuid(compUuid);
		searchRoleMod.setRoleUuid(roleUuid);
		List<RoleMod> roleModList = roleModExMapper.findRoleMods(searchRoleMod);
		Map<String, RoleMod> roleModMap = null;
		if (CollectionUtils.isNotEmpty(roleModList)) {
			roleModMap = roleModList.stream().collect(Collectors.toMap(RoleMod::getModuleUuid, roleMod -> roleMod));
		}
		for (int i = 0; i < moduleUuids.size(); i++) {
			if (roleModMap != null && roleModMap.get(moduleUuids.get(i)) != null) {
				RoleMod roleMod = roleModMap.get(moduleUuids.get(i));
				if (!roleMod.getDeleteFlag()) {
					roleMod.setUpdateTime(new Date());
					roleMod.setDeleteFlag(true);
					roleModMapper.updateByPrimaryKey(roleMod);
				}
			}
		}
		return 1;
	}

}
