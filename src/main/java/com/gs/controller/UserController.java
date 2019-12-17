package com.gs.controller;

import com.gs.pojo.User;
import com.gs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;

@Controller(value = "/user/")
public class UserController {
    @Autowired
    private UserService userService;
    public void getUser(HttpRequest request){
    }
}
