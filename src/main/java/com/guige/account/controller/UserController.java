package com.guige.account.controller;

import com.guige.account.pojo.dto.UserDto;
import com.guige.account.pojo.entity.User;
import com.guige.account.pojo.vo.UserVo;
import com.guige.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Anwei.S
 * @CreateDate 2017年2月14日 上午10:27:46
 * @Description:对外提供的接口
 */
@RestController
@RequestMapping(value = "/v1/users")
@SuppressWarnings("all")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody UserVo user) {

        return userService.createUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Integer updateUser(@RequestBody UserVo user) {
        return userService.updateUser(user);
    }
    @RequestMapping(value="/all",method = RequestMethod.PUT)
    public Integer updateUserAll(@RequestBody UserVo user) {
        return userService.updateUserAll(user);
    }
    @RequestMapping(method = RequestMethod.GET)
    public User findByUserUuid(@RequestParam("uuid") String uuid) {
        return userService.findByUserUuid(uuid);
    }

    /**
     * 修改用户 密码
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/updateUserPassword", method = RequestMethod.PUT)
    public Integer updateUserPassword(@RequestParam("uuid") String uuid, @RequestParam("oldPassword") String oldPassword, @RequestParam("password") String password) {
        return userService.updateUserPassword(uuid, oldPassword, password);
    }
    @RequestMapping(value = "/updateUserPasswordByMobile", method = RequestMethod.PUT)
    public Integer updateUserPasswordByMobile(@RequestParam("mobile") String mobile, @RequestParam("password") String password) {
        return userService.updateUserPassword(mobile, password);
    }
    @RequestMapping(value = "/updateUserMobile", method = RequestMethod.PUT)
    public Integer updateUserMobile(@RequestParam("uuid") String uuid, @RequestParam("mobile") String mobile, @RequestParam("oldPassword") String oldPassword) {
        return userService.updateUserMobile(uuid, mobile, oldPassword);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public UserDto login(@RequestParam("username") String username,
                         @RequestParam("password") String password) {
        return userService.login(username, password);
    }

    /**
     * 根据用户名(手机号) 查询用户列表
     * @param username
     * @return
     */
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/checkUserName", method = RequestMethod.GET)
    public List<User> checkUserName(@RequestParam("username") String username) {

        return userService.checkUserName(username);
    }

    @RequestMapping(value = "/correlationRoles", method = RequestMethod.POST)
    public Integer correlationRoles(@RequestParam("compUuid") String compUuid,
                                    @RequestParam("userUuid") String userUuid, @RequestParam("roleUuids[]") List<String> roleUuids, @RequestParam("relaStatus")String relaStatus) {

        return userService.correlationRoles(compUuid, userUuid, roleUuids,relaStatus);
    }

    @RequestMapping(value = "/uncorrelationRoles", method = RequestMethod.POST)
    public Integer uncorrelationRoles(@RequestParam("compUuid") String compUuid,
                                      @RequestParam("userUuid") String userUuid, @RequestParam("roleUuids[]") List<String> roleUuids) {
        return userService.uncorrelationRoles(compUuid, userUuid, roleUuids);
    }




    /**
     * 启/禁 公司管理员
     * @param userRoleUuid 用户角色编号
     * @param onOffFlag 启禁标识 0：启；1：禁
     * @return
     */
    @RequestMapping(value = "/onOff", method = RequestMethod.PUT)
    public Integer modifyCompManageOnOff(@RequestParam("userRoleUuid") String userRoleUuid,
                                         @RequestParam("onOffFlag") String onOffFlag) {
        return userService.modifyCompManageOnOff(userRoleUuid, onOffFlag);
    }

    /**
     * 转移超级管理员
     * @param compUuid 公司编号
     * @param oldMobile 源手机号
     * @param newMobile 新手机号
     * @return
     */
    @RequestMapping(value = "/transferAdmin", method = RequestMethod.PUT)
    public Integer transferAdmin(@PathVariable("compUuid") String compUuid,
                                 @PathVariable("oldMobile")String oldMobile,
                                 @PathVariable("newMobile")String newMobile){
        return userService.transferAdmin(compUuid,oldMobile,newMobile);
    }

    /**
     * 根据公司id+员工id删除角色关联
     * @param compUuid
     * @param emplUuid
     * @return
     */
    @RequestMapping(value = "/uncorrelationEmplRole", method = RequestMethod.POST)
    public Integer uncorrelationEmplRole(@RequestParam("compUuid") String compUuid,
                                         @RequestParam("emplUuid") String emplUuid) {
        return userService.uncorrelationEmplRole(compUuid, emplUuid);
    }

    /**
     * 修改公司关联状态
     * @param userRoleUuid 用户角色编号
     * @param relaStatus 关联状态:0未关联;1已关联;
     * @return
     */
    @RequestMapping(value = "/modifyCompManageRelaStatus", method = RequestMethod.PUT)
    public Integer modifyCompManageRelaStatus(@RequestParam("userRoleUuid") String userRoleUuid,
                                              @RequestParam("relaStatus") String relaStatus) {
        return userService.modifyCompManageRelaStatus(userRoleUuid, relaStatus);
    }

}
