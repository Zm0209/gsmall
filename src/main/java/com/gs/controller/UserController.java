package com.gs.controller;

import com.gs.pojo.User;
import com.gs.service.UserService;
import com.gs.service.impl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService UserService;

    @RequestMapping(value = "getUser.do",method = RequestMethod.GET)
    @ResponseBody
    public void getUser(int id){
        User user = UserService.getUser(id);
        if (user!=null){
            System.out.println("查到了");
        }
    }
}
