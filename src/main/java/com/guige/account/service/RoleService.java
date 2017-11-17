package com.guige.account.service;

import com.guige.account.pojo.entity.Role;
import com.guige.account.pojo.entity.UserRole;
import com.guige.account.pojo.vo.RoleVo;

import java.util.List;

/**
 * @author Anwei.S
 * @CreateDate 2017年2月14日 下午1:43:01
 * @Description:角色service
 */
public interface RoleService {
	/**
	 * 创建角色
	 * 
	 * @param role
	 * @return
	 */
	Role createRole(RoleVo role);

	/**
	 * 检查角色名
	 * 
	 * @param roleName
	 * @return
	 */
	List<Role> checkRoleName(String compUuid, String roleName);

	/**
	 * 删除角色
	 * 
	 * @param roleUuids 角色列表
	 * @return
	 */
	int deleteRole(List<String> roleUuids);

	/**
	 * 修改角色
	 * 
	 * @param role
	 * @return
	 */
	int updateRole(RoleVo role);

	/**
	 * 根据公司id+用户id获取公司下用户的角色
	 * 
	 * @param compUuid 公司id 可选
	 * @param userUuid 用户id 可选
	 * @return
	 */
	List<UserRole> findUserRoles(String compUuid, String userUuid);

	/**
	 * 获取公司下用户的角色
	 * 
	 * @param compUuid 公司id 可选
	 * @return
	 */
	List<Role> findRoles(String compUuid);

	/**
	 * 获取预定义管理员角色
	 * @return
	 */
	List<Role> getPredefineRoles();

	/**
	 * 获取预定义 员工角色
	 * @return
	 */
	List<Role> getEmplRoles();
	/**
	 * 给角色赋予功能
	 * 
	 * @param compUuid
	 * @param roleUuid
	 * @param moduleUuids
	 * @return
	 */
	int correlationModules(String compUuid, String roleUuid, List<String> moduleUuids);

	/**
	 * 给角色解除关联功能
	 * 
	 * @param compUuid
	 * @param roleUuid
	 * @param moduleUuids
	 * @return
	 */
	int uncorrelationModules(String compUuid, String roleUuid, List<String> moduleUuids);

	/**
	 * 给某个角色禁用/解除禁用某个模块
	 * @param compUuid
	 * @param roleUuid
	 * @param moduleUuids
	 * @return
	 */
	int enabledModules(String compUuid, String roleUuid, List<String> moduleUuids, Boolean enabled);
}
