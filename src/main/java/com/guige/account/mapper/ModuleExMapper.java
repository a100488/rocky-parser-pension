package com.guige.account.mapper;


import com.guige.account.pojo.entity.Module;
import com.guige.account.pojo.entity.RoleMod;
import com.guige.account.pojo.vo.ModuleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ModuleExMapper {
	/**
	 * 根据对象中的字段(uuid,serviceCd,moduleCd,moduleName,moduleUuids)查询出功能列表
	 * @param module
	 * @return
	 */
	List<Module> findModules(ModuleVo module);
	/**
	 * 根据公司id,用户id,角色id查询权限
	 * @param compUuid
	 * @param userUuid
	 * @param roleUuid
	 * @return
	 */
	List<Module> findModulesByUserOrRole(@Param("compUuid") String compUuid, @Param("userUuid") String userUuid, @Param("roleUuid") String roleUuid, @Param("enabled") String enabled);
	/**
	 * 删除权限集合
	 * @param module    moduleUuids不能为空
	 * @return
	 */
	int deleteModule(ModuleVo module);

	/**
	 * 检查模块是否存在
	 * @param serviceCd
	 * @param moduleName
	 * @param moduleCd
	 * @return
	 */
	List<Module> checkModule(@Param("serviceCd") String serviceCd, @Param("moduleName") String moduleName, @Param("moduleCd") String moduleCd);
	
	/**
	 * 根据公司id,用户id,查询权限
	 * @param compUuid
	 * @param userUuid
	 * @return
	 */
	List<RoleMod> findModulesByUser(@Param("compUuid") String compUuid, @Param("userUuid") String userUuid);

}