package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<User> fidAll() {
        return userService.findAll();
    }

    @RequestMapping("login")
    @ResponseBody
    public User login(String email, String password) {
        return userService.login(email, password);
    }

    @RequestMapping("findOne")
    @ResponseBody
    public User findOne() {
        return userService.findOne();
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public void updateUser(User user){
        userService.updateUser(user);
    }

    @RequestMapping("updatePassword")
    @ResponseBody
    public User updatePassword(String password){
        return null;
    }
}
