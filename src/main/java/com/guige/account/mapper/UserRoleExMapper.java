package com.guige.account.mapper;


import com.guige.account.pojo.entity.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRoleExMapper {
	/**
	 * 根据对象中字段进行查询(userUuid,roleUuid,compUuid)
	 * @param userRole
	 * @return
	 */
    List<UserRole> findUserRoles(UserRole userRole);

	/**
	 * 修改用户编号
	 * @param compUuid 公司编号
	 * @param oldUserUuid 老的用户编号
	 * @param newUserUuid 新的用户编号
	 * @return
	 */
	int updateUserUuid(@Param("compUuid") String compUuid,
                       @Param("oldUserUuid") String oldUserUuid,
                       @Param("newUserUuid") String newUserUuid);
}