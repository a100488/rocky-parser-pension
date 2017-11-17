package com.guige.account.service;

import com.guige.account.mapper.UserExMapper;
import com.guige.account.pojo.dto.UserDto;
import com.guige.account.pojo.entity.Role;
import com.guige.account.pojo.entity.User;
import com.guige.account.pojo.vo.UserVo;
import com.guige.base.exception.BadRequestException;
import com.guige.base.util.MessageUtil;
import com.guige.base.util.StringUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Song.aw
 * @create 2017-11-15 12:41
 **/
@Service
public class CustomUserService implements UserDetailsService {
    @Autowired
    UserExMapper userExMapper;
    @Autowired
    RoleService roleService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (StringUtils.isEmpty(username)) {
            throw new BadRequestException("error.10008", this);
        }
        UserDto userDto = null;


        UserVo userVo = new UserVo();
        userVo.setMobile(username);
        List<User> users = userExMapper.findUsers(userVo);

        if (CollectionUtils.isNotEmpty(users) && users.size() == 1) {
            User user = users.get(0);
            userDto = new UserDto();
            BeanUtils.copyProperties(user, userDto);
            List<Role> roles= roleService.getPredefineRoles();
            userDto.setRoles(roles);
        } else {
            throw new UsernameNotFoundException(MessageUtil.getMessage("error.10007"));
        }
        return userDto;
    }
}
