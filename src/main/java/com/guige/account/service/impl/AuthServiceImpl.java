package com.guige.account.service.impl;

import com.guige.account.pojo.dto.UserDto;
import com.guige.account.pojo.vo.UserVo;
import com.guige.account.service.AuthService;
import com.guige.account.service.UserService;
import com.guige.base.exception.BadRequestException;
import com.guige.base.util.StringUtils;
import com.guige.base.util.JwtTokenUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    UserService userService;

    @Value("${jwt.tokenHead}")
    private String tokenHead;



    @Override
    public UserDto register(UserVo user) {
        if (user == null || StringUtils.isBlank(user.getMobile()) || StringUtils.isBlank(user.getPassword())) {
            throw new BadRequestException("error.10008", this);
        }
        StandardPasswordEncoder encoder = new StandardPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        UserDto userDto = new UserDto();
        if(  userService.createUser(user)!=null) {
           UserDetails userDetails = userDetailsService.loadUserByUsername(user.getMobile());
            BeanUtils.copyProperties(userDetails,userDto);
        }
        return userDto;
    }

    @Override
    public String login(String username, String password) {
        UsernamePasswordAuthenticationToken upToken = new UsernamePasswordAuthenticationToken(username, password);
        // Perform the security
        final Authentication authentication = authenticationManager.authenticate(upToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // Reload password post-security so we can generate token
        final UserDetails userDetails = userDetailsService.loadUserByUsername(username);

        final String token = jwtTokenUtil.generateToken(userDetails);
        return token;
    }

    @Override
    public String refresh(String oldToken) {
        final String token = oldToken.substring(tokenHead.length());
        String username = jwtTokenUtil.getUsernameFromToken(token);
        UserDto userDto = new UserDto();
        UserDetails userDetails =  userDetailsService.loadUserByUsername(username);
        BeanUtils.copyProperties(userDetails,userDto);
        if (jwtTokenUtil.canTokenBeRefreshed(token, userDto.getUpdateTime())){
            return jwtTokenUtil.refreshToken(token);
        }
        return null;
    }
}