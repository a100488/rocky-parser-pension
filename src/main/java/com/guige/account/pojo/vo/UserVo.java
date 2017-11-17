package com.guige.account.pojo.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.guige.account.pojo.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Anwei.S
 * @CreateDate 2017年2月14日 上午10:42:41
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserVo extends User {
	private static final long serialVersionUID = 1L;

}
