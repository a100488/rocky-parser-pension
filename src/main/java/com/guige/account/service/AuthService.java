package com.guige.account.service;

import com.guige.account.pojo.entity.User;
import com.guige.account.pojo.vo.UserVo;

public interface AuthService {
    User register(UserVo userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}