package com.gs.service.impl;

import com.gs.dao.UserMapper;
import com.gs.pojo.User;
import com.gs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class IUserService implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(Integer id) {
        return userMapper.selectUserById(id);
    }
}
