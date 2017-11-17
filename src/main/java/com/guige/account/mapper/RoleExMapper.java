package com.guige.account.mapper;

import com.guige.account.pojo.entity.Role;
import com.guige.account.pojo.vo.RoleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleExMapper {
	/**
	 * 根据对象中字段进行查询(uuid,compUuid,roleName,roleUuids)
	 * @param role
	 * @return
	 */	List<Role> findRoles(RoleVo role);

	/**
	 * 根据公司uuid 查询出role
	 * @param compUuid
	 * @return
	 */
	List<Role> findRolesByCompUuid(@Param("compUuid") String compUuid);

	/**
	 * 获取预定义超级管理员
	 * @return
	 */
	List<Role> getPredefineRoles();

	/**
	 * 获取预定义 员工角色
	 * @return
	 */
	List<Role> getEmplRoles();
	/**
	 * 删除角色集合
	 * @param role roleUuids集合不能为空
	 * @return
	 */
	int deleteRole(RoleVo role);

	
	
 
}