package com.guige.account.mapper;


import com.guige.account.pojo.entity.User;
import com.guige.account.pojo.vo.UserVo;

import java.util.List;

/**
 * @author Anwei.S
 * @CreateDate 2017年2月15日 下午1:50:09
 * @Description:
 */
public interface UserExMapper {
	/**
	 * 根据对象中字段进行查询(userUuid,mobile)
	 * @param user
	 * @return
	 */
	List<User> findUsers(UserVo user);

}
