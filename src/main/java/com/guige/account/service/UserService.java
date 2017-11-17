package com.guige.account.service;


import com.guige.account.pojo.dto.UserDto;
import com.guige.account.pojo.entity.User;
import com.guige.account.pojo.vo.UserVo;

import java.util.List;

/**
 * @author Anwei.S
 * @CreateDate 2017年2月14日 下午1:43:01
 * @Description:用户service
 */
public interface UserService {
    /**
     * 登陆
     *
     * @param username
     * @param password
     * @return
     */
    UserDto login(String username, String password);


    /**
     * 创建用户
     *
     * @param user
     * @return
     */
    User createUser(UserVo user);

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    int updateUser(UserVo user);

    /**
     * 修改用户所有信息
     * @param user
     * @return
     */
    int updateUserAll(UserVo user);

    /**
     * 检查用户名
     *
     * @param userName
     * @return
     */
    List<User> checkUserName(String userName);

    /**
     * 给用户赋予角色
     *
     * @param compUuid
     * @param userUuid
     * @param roleUuids
     * @return
     */
    int correlationRoles(String compUuid, String userUuid, List<String> roleUuids, String relaStatus);

    /**
     * 给用户解除关联角色
     *
     * @param compUuid
     * @param userUuid
     * @param roleUuids
     * @return
     */
    int uncorrelationRoles(String compUuid, String userUuid, List<String> roleUuids);

    /**
     * 修改密码
     * @param uuid
     * @param oldPassword
     * @param password
     * @return
     */
    Integer updateUserPassword(String uuid, String oldPassword, String password);

    /**
     * 找回密码
     * @param mobile
     * @param password
     * @return
     */
    Integer updateUserPassword(String mobile, String password);

    /**
     * 修改手机号
     * @param uuid
     * @param mobile
     * @param oldPassword
     * @return
     */
    Integer updateUserMobile(String uuid, String mobile, String oldPassword);

    /**
     * 查询用户
     * @param uuid
     * @return
     */
    User findByUserUuid(String uuid);



    /**
     *  启/禁 公司管理员
     * @param userRoleUuid 用户角色编号
     * @param onOffFlag 启禁标识 0：启；1：禁
     * @return
     */
    Integer modifyCompManageOnOff(String userRoleUuid, String onOffFlag);

    /**
     * 转移超级管理员
     * @param compUuid 公司编号
     * @param oldMobile 源手机号
     * @param newMobile 新手机号
     * @return
     */
    Integer transferAdmin(String compUuid, String oldMobile, String newMobile);

    /**
     * 根据公司id+员工id删除员工对应的角色
     * @param compUuid
     * @param emplUuid
     * @return
     */
    Integer uncorrelationEmplRole(String compUuid, String emplUuid);

    /**
     * 修改公司关联状态
     * @param userRoleUuid 用户角色编号
     * @param relaStatus 关联状态:0未关联;1已关联;
     * @return
     */
    Integer modifyCompManageRelaStatus(String userRoleUuid, String relaStatus);

}
