package com.guige.account.controller;

import com.guige.account.pojo.entity.Role;
import com.guige.account.pojo.entity.UserRole;
import com.guige.account.pojo.vo.RoleVo;
import com.guige.account.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Anwei.S
 * @CreateDate 2017年2月14日 上午10:27:46
 * @Description:对外提供的接口
 */
@RestController
@RequestMapping(value = "/v1/roles")
@SuppressWarnings("all")
public class RoleController {
	@Autowired
	RoleService roleService;

	/**
	 * 创建角色
	 * @param role
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public Role createRole(@RequestBody RoleVo role) {

		return roleService.createRole(role);
	}

	/**
	 * 删除角色
	 * @param roleUuids
	 * @return
	 */
	@RequestMapping(method = RequestMethod.DELETE)
	public Integer deleteRole(@RequestParam("roleUuids[]") List<String> roleUuids) {
		return roleService.deleteRole(roleUuids);
	}

	/**
	 * 修改角色
	 * @param role
	 * @return
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public Integer updateRole(@RequestBody RoleVo role) {
		return roleService.updateRole(role);
	}

	/**
	 * 检查角色名称
	 * @param compUuid
	 * @param roleName
	 * @return
	 */
	@RequestMapping(value = "/checkRoleName", method = RequestMethod.GET)
	public List<Role> checkModulerName(@RequestParam("compUuid") String compUuid,
			@RequestParam("roleName") String roleName) {
		return roleService.checkRoleName(compUuid, roleName);
	}

	/**
	 * 根据公司id+用户id获取角色列表
	 * @param compUuid
	 * @param userUuid
	 * @return
	 */
	@RequestMapping(value = "/rolesByUserAndComp", method = RequestMethod.GET)
	public List<UserRole> findUserRoles(@RequestParam("compUuid") String compUuid,
										@RequestParam("userUuid") String userUuid) {
		return roleService.findUserRoles(compUuid, userUuid);
	}

	/**
	 * 根据用户id获取角色列表
	 * @param userUuid
	 * @return
	 */
	@RequestMapping(value = "/rolesByUser", method = RequestMethod.GET)
	public List<UserRole> findUserRolesByUserUuid(@RequestParam("userUuid") String userUuid) {
		return roleService.findUserRoles(null, userUuid);
	}

	/**
	 * 根据公司获取角色列表
	 * @param compUuid
	 * @return
	 */
	@RequestMapping(value = "/rolesByComp", method = RequestMethod.GET)
	public List<Role> findRoles(@RequestParam("compUuid") String compUuid) {

		return roleService.findRoles(compUuid);
	}

	/**
	 * 获取预定义角色
	 * @return
	 */
	@RequestMapping(value = "/predefineRoles", method = RequestMethod.GET)
	public List<Role> getPredefineRoles() {
		return roleService.getPredefineRoles();
	}

	/**
	 * 关联权限
	 * @param compUuid
	 * @param roleUuid
	 * @param moduleUuids
	 * @return
	 */
	@RequestMapping(value = "/correlationModules", method = RequestMethod.POST)
	public Integer correlationModules(@RequestParam("compUuid") String compUuid,
                                      @RequestParam("roleUuid") String roleUuid, @RequestParam("moduleUuids[]") List<String> moduleUuids) {
		return roleService.correlationModules(compUuid, roleUuid, moduleUuids);
	}

	/**
	 * 解除关联 权限
	 * @param compUuid
	 * @param roleUuid
	 * @param moduleUuids
	 * @return
	 */
	@RequestMapping(value = "/uncorrelationModules", method = RequestMethod.POST)
	public Integer uncorrelationModules(@RequestParam("compUuid") String compUuid,
                                        @RequestParam("roleUuid") String roleUuid, @RequestParam("moduleUuids[]") List<String> moduleUuids) {
		return roleService.uncorrelationModules(compUuid, roleUuid, moduleUuids);
	}

	/**
	 * 启用权限
	 * @param compUuid
	 * @param roleUuid
	 * @param moduleUuids
	 * @param enabled
	 * @return
	 */
	@RequestMapping(value = "/enabledModules", method = RequestMethod.POST)
	public Integer enabledModules(@RequestParam("compUuid") String compUuid,
                                  @RequestParam("roleUuid") String roleUuid, @RequestParam("moduleUuids[]") List<String> moduleUuids,
                                  @RequestParam("enabled") Boolean enabled) {
		return roleService.enabledModules(compUuid, roleUuid, moduleUuids, enabled);
	}
}
