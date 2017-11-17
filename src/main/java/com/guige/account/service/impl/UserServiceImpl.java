package com.guige.account.service.impl;


import com.guige.account.mapper.UserExMapper;
import com.guige.account.mapper.UserMapper;
import com.guige.account.mapper.UserRoleExMapper;
import com.guige.account.mapper.UserRoleMapper;
import com.guige.account.pojo.constant.CodeConstant;
import com.guige.account.pojo.dto.UserDto;
import com.guige.account.pojo.entity.User;
import com.guige.account.pojo.entity.UserRole;
import com.guige.account.pojo.vo.UserVo;
import com.guige.account.service.RoleService;
import com.guige.account.service.UserService;
import com.guige.base.exception.BadRequestException;
import com.guige.base.util.StringUtils;
import com.guige.base.util.UuidUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserExMapper userExMapper;
    @Autowired
    UserRoleMapper userRoleMapper;
    @Autowired
    UserRoleExMapper userRoleExMapper;
    @Autowired
    RoleService roleService;

    @Override
    public UserDto login(String username, String password) {
        if (username == null || password == null) {
            throw new BadRequestException("error.10008", this);
        }
        UserDto userDto = null;


        UserVo userVo = new UserVo();
        userVo.setMobile(username);
        List<User> users = userExMapper.findUsers(userVo);
        if (CollectionUtils.isNotEmpty(users) && users.size() == 1) {
            User user = users.get(0);

            if (user.getPassword().equals(user.getPassword())) {
                userDto = new UserDto();
                BeanUtils.copyProperties(user, userDto);
            } else {
                throw new BadRequestException("error.10007", username, this);
            }
        } else {
            throw new BadRequestException("error.10007", username, this);
        }
        return userDto;
    }

    @Override
    public User createUser(UserVo user) {
        if (user == null || StringUtils.isBlank(user.getMobile()) || StringUtils.isBlank(user.getPassword())) {
            throw new BadRequestException("error.10008", this);
        }
        // 校验用户名是否重复
        UserVo userVo = new UserVo();
        userVo.setMobile(user.getMobile());
        List<User> users = userExMapper.findUsers(userVo);
        if (CollectionUtils.isNotEmpty(users)) {
            throw new BadRequestException("error.10006", this);
        }
        User u = new User();
        BeanUtils.copyProperties(user, u);

        // 赋值
       // u.setPassword(hash.toHex());

        u.setUuid(UuidUtils.base58Uuid());
        u.setIsActive(true);
        u.setInitFlag(CodeConstant.NO);
        u.setInsertTime(new Date());
        u.setUpdateTime(new Date());
        int result = userMapper.insertSelective(u);
        if (result > 0) {
            return u;
        } else {
            throw new BadRequestException("error.10005", this);
        }
    }

    @Override
    public int updateUser(UserVo user) {
        if (user == null || StringUtils.isBlank(user.getUuid())) {
            throw new BadRequestException("error.10008", this);
        }
        User u = userMapper.selectByPrimaryKey(user.getUuid());
        if (u == null) {
            throw new BadRequestException("error.1001", this);
        }
        BeanUtils.copyProperties(user, u);
        u.setUpdateTime(new Date());
        return userMapper.updateByPrimaryKeySelective(u);

    }
    @Override
    public int updateUserAll(UserVo user) {
        if (user == null || StringUtils.isBlank(user.getUuid())) {
            throw new BadRequestException("error.10008", this);
        }
        User u = userMapper.selectByPrimaryKey(user.getUuid());
        if (u == null) {
            throw new BadRequestException("error.1001", this);
        }
      //  BaseEncryptEntity temp = new BaseEncryptEntity();
      //  BeanUtils.copyProperties(u, temp);
        BeanUtils.copyProperties(user, u);
     //   BeanUtils.copyProperties(temp, u);
        u.setUpdateTime(new Date());
        return userMapper.updateByPrimaryKey(u);

    }

    @Override
    public List<User> checkUserName(String userName) {
        if (StringUtils.isBlank(userName)) {
            throw new BadRequestException("error.10008", this);
        }
        UserVo userVo = new UserVo();
        userVo.setMobile(userName);
        List<User> users = userExMapper.findUsers(userVo);
        return users;
    }

    @Override

    public int correlationRoles(String compUuid, String userUuid, List<String> roleUuids,String relaStatus) {
        if (CollectionUtils.isEmpty(roleUuids)) {
            return 0;
        }
        roleUuids = roleUuids.stream().distinct().collect(Collectors.toList());
        UserRole searchUserRole = new UserRole();
        searchUserRole.setCompUuid(compUuid);
        searchUserRole.setUserUuid(userUuid);
        List<UserRole> userRoleList = userRoleExMapper.findUserRoles(searchUserRole);
        Map<String, UserRole> userRoleMap = null;
        if (CollectionUtils.isNotEmpty(userRoleList)) {
            userRoleMap = userRoleList.stream().collect(Collectors.toMap(UserRole::getRoleUuid, userRole -> userRole));
        }
        for (int i = 0; i < roleUuids.size(); i++) {
            if (userRoleMap != null && userRoleMap.get(roleUuids.get(i)) != null) {
                UserRole userRole = userRoleMap.get(roleUuids.get(i));
                if (userRole.getDeleteFlag()) {
                    userRole.setUpdateTime(new Date());
                    //userRole.buildForUpdate();
                    userRole.setDeleteFlag(false);
                    userRoleMapper.updateByPrimaryKey(userRole);
                }
            } else {
                UserRole userRole = new UserRole();
                userRole.setCompUuid(compUuid);
                userRole.setRoleUuid(roleUuids.get(i));
                userRole.setUserUuid(userUuid);
                userRole.setOnOffFlag(CodeConstant.NO);
                if(StringUtils.isEmpty(relaStatus)) {
                    userRole.setRelaStatus(CodeConstant.NO);
                }else{
                    userRole.setRelaStatus(relaStatus);
                }
                userRole.setInsertTime(new Date());

                userRoleMapper.insert(userRole);
            }
        }

        return 1;
    }

    @Override
    public int uncorrelationRoles(String compUuid, String userUuid, List<String> roleUuids) {
        if (CollectionUtils.isEmpty(roleUuids)) {
            return 0;
        }
        roleUuids = roleUuids.stream().distinct().collect(Collectors.toList());
        UserRole searchUserRole = new UserRole();
        searchUserRole.setCompUuid(compUuid);
        searchUserRole.setUserUuid(userUuid);
        List<UserRole> userRoleList = userRoleExMapper.findUserRoles(searchUserRole);
        Map<String, UserRole> userRoleMap = null;
        if (CollectionUtils.isNotEmpty(userRoleList)) {
            userRoleMap = userRoleList.stream().collect(Collectors.toMap(UserRole::getRoleUuid, userRole -> userRole));
        }
        for (int i = 0; i < roleUuids.size(); i++) {
            if (userRoleMap != null && userRoleMap.get(roleUuids.get(i)) != null) {
                UserRole userRole = userRoleMap.get(roleUuids.get(i));
                if (!userRole.getDeleteFlag()) {
                    userRole.setDeleteFlag(true);
                    userRole.setUpdateTime(new Date());
                    userRoleMapper.updateByPrimaryKey(userRole);
                }
            }
        }
        return 1;
    }
    @Override
    public Integer uncorrelationEmplRole(String compUuid, String emplUuid) {
        if (StringUtils.isEmpty(emplUuid)||StringUtils.isEmpty(compUuid)) {
            return 0;
        }
       // roleUuids = roleUuids.stream().distinct().collect(Collectors.toList());
        UserRole searchUserRole = new UserRole();
        searchUserRole.setCompUuid(compUuid);
        searchUserRole.setEmplUuid(emplUuid);
        List<UserRole> userRoleList = userRoleExMapper.findUserRoles(searchUserRole);
        Map<String, UserRole> userRoleMap = null;
        if (CollectionUtils.isNotEmpty(userRoleList)) {
            for (int i = 0; i < userRoleList.size(); i++) {
                if (userRoleList.get(i) != null) {
                    UserRole userRole = userRoleList.get(i);
                    if (!userRole.getDeleteFlag()) {
                        userRole.setUpdateTime(new Date());
                        userRole.setDeleteFlag(true);
                        userRoleMapper.updateByPrimaryKey(userRole);
                    }
                }
            }
        }
        return 1;
    }
    @Override
    public Integer updateUserPassword(String uuid, String oldPassword, String password) {

        if (StringUtils.isBlank(uuid) || StringUtils.isBlank(oldPassword) || StringUtils.isBlank(password)) {
            throw new BadRequestException("error.10008", this);
        }
        User u = userMapper.selectByPrimaryKey(uuid);
        if (u == null) {
            throw new BadRequestException("error.1001", this);
        }

        if (!password.equals(u.getPassword())) {
            throw new BadRequestException("error.10009", this);
        }

        // 赋值
        u.setPassword(password);
        u.setUpdateTime(new Date());
        return userMapper.updateByPrimaryKeySelective(u);

    }

    @Override
    public Integer updateUserPassword(String mobile, String password) {

        if (StringUtils.isBlank(mobile) || StringUtils.isBlank(password)) {
            throw new BadRequestException("error.10008", this);
        }
        UserVo userVo = new UserVo();
        userVo.setMobile(mobile);
        List<User> users = userExMapper.findUsers(userVo);
        if (CollectionUtils.isEmpty(users)) {
            throw new BadRequestException("error.1001", this);
        }
        for (User u : users) {

            // 赋值
            u.setPassword(password);
            u.setUpdateTime(new Date());
            userMapper.updateByPrimaryKeySelective(u);
        }
        return 1;

    }

    @Override
    public Integer updateUserMobile(String uuid, String mobile, String oldPassword) {
        //1.查询手机号是否存在
        //2.如果存在 则抛错
        if (StringUtils.isBlank(uuid) || StringUtils.isBlank(oldPassword)) {
            throw new BadRequestException("error.10008", this);
        }
        User u = userMapper.selectByPrimaryKey(uuid);
        if (u == null) {
            throw new BadRequestException("error.1001", this);
        }

        if (!oldPassword.equals(u.getPassword())) {
            throw new BadRequestException("error.10009", this);
        }

        UserVo userVo = new UserVo();
        userVo.setMobile(mobile);
        List<User> users = userExMapper.findUsers(userVo);
        //TODO 是否包含禁用的
        if (CollectionUtils.isNotEmpty(users)) {
            throw new BadRequestException("error.10010", this);
        }
        u.setMobile(mobile);
        u.setUpdateTime(new Date());
        return userMapper.updateByPrimaryKeySelective(u);
    }

    @Override
    public User findByUserUuid(String uuid) {

        return userMapper.selectByPrimaryKey(uuid);
    }



    @Override
    public Integer modifyCompManageOnOff(String userRoleUuid, String onOffFlag) {
        UserRole userRole = new UserRole();
        userRole.setUuid(userRoleUuid);
        userRole.setOnOffFlag(onOffFlag);
        return userRoleMapper.updateByPrimaryKeySelective(userRole);
    }

    @Override
    public Integer transferAdmin(String compUuid, String oldUserName, String newUserName) {

        UserVo userVo = new UserVo();
        userVo.setMobile(oldUserName);
        List<User> oldUsers = userExMapper.findUsers(userVo);
        if(CollectionUtils.isEmpty(oldUsers))
            throw new BadRequestException("error.10011", this);

        userVo.setMobile(newUserName);
        List<User> newUsers = userExMapper.findUsers(userVo);
        if(CollectionUtils.isEmpty(newUsers))
            throw new BadRequestException("error.10011", this);

        return userRoleExMapper.updateUserUuid(compUuid, oldUsers.get(0).getUuid(), newUsers.get(0).getUuid());

    }

    @Override
    public Integer modifyCompManageRelaStatus(String userRoleUuid, String relaStatus) {
        if(!CodeConstant.YES.equals(relaStatus) && !CodeConstant.NO.equals(relaStatus)){
            throw new BadRequestException("error.10012", this);
        }
        UserRole userRole = new UserRole();
        userRole.setUuid(userRoleUuid);
        userRole.setRelaStatus(relaStatus);
        return userRoleMapper.updateByPrimaryKeySelective(userRole);
    }


}
