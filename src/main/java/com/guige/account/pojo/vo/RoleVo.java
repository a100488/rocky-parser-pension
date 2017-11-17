package com.guige.account.pojo.vo;

import com.guige.account.pojo.entity.Role;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author Anwei.S
 * @CreateDate 2017年2月14日 下午2:09:13
 * @Description: 角色增删改查
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RoleVo extends Role {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 用户di
	 */
	private String userUuid;
	/**
	 * 角色ids
	 */
	List<String> roleUuids;
}
