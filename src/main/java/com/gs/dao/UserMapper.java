package com.gs.dao;

import com.gs.pojo.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    public User selectUserById(Integer id);
}
