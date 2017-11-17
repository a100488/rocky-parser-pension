package com.guige.account.service;


import com.guige.account.pojo.entity.Module;
import com.guige.account.pojo.entity.RoleMod;
import com.guige.account.pojo.vo.ModuleVo;

import java.util.List;
import java.util.Map;

/**
 * @author Anwei.S
 * @CreateDate 2017年2月14日 下午1:43:01
 * @Description:模块service
 */
public interface ModuleService {
	/**
	 * 创建模块
	 * @param module
	 * @return
	 */
	Module createModule(ModuleVo module);
	/**
	 * 检查模块serviceCd
	 * @param serviceCd 服务code 可选
	 * @return
	 */
	List<Module> checkModuleServiceCd(String serviceCd);
	/**
	 * 检查模块moduleName
	 * @param moduleName 模块名称 可选
	 * @return
	 */
	List<Module> checkModuleModuleName(String moduleName);
	/**
	 * 检查模块moduleCd
	 * @param moduleCd 模块code 可选
	 * @return
	 */
	List<Module> checkModuleModuleCd(String moduleCd);
	/**
	 * 删除模块
	 * @param module
	 * @return
	 */
	int deleteModule(List<String> moduleUuids); 
	
	/**
	 * 修改模块
	 * @param module
	 * @return
	 */
	int updateModule(ModuleVo module);
	/**
	 * 根据用户id+角色id获取公司下用户的模块
	 * @param compUuid
	 * @param userUuid
	 * @return
	 */
	List<Module> findModules(String compUuid, String userUuid, String roleUuid);
	
	/**
	 * 根据用户id获取公司下用户的模块
	 * @param compUuid
	 * @param userUuid
	 * @return
	 */
	List<RoleMod> findModules(String compUuid, String userUuid);
	
	/**
	 * 返回用户下所有的权限包括被禁用的
	 * @param compUuid
	 * @param userUuid
	 * @return
	 */
	List<Module> findModulesAllByUser(String compUuid, String userUuid);
	/**
	 * 返回公司下所有的权限包括被禁用的
	 * @param compUuid
	 * @param userUuid
	 * @return
	 */
	List<Module> findModulesAllByComp(String compUuid);
	/**
	 * 返回所有的模块
	 * @return
	 */
	Map<String,String> findModulesUrl();

}
