package com.guige.account.pojo.vo;

import com.guige.account.pojo.entity.Module;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author Anwei.S
 * @CreateDate 2017年2月14日 下午3:47:11
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ModuleVo extends Module {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 用户id
	 */
	private String userUuid;
	/**
	 * 角色id
	 */
	private String roleUuid;
	/**
	 * 功能ids
	 */
	List<String> moduleUuids;
}
