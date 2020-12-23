package com.qf.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.pojo.User;
import com.qf.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
@Api(tags = "用户操作")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("查询所有")
    @RequestMapping("findAll")
    @ResponseBody
    public List<User> fidAll() {
        return userService.findAll();
    }

    @ApiOperation("登陆")
    @RequestMapping("login")
    @ResponseBody
    public User login(String email, String password) {
        return userService.login(email, password);
    }

    @ApiOperation("查询一个用户")
    @RequestMapping("findOne")
    @ResponseBody
    public User findUser(long id) {
        User user = userService.findOneById(id);
        return user;
    }

    @ApiOperation("修改用户信息")
    @RequestMapping("updateUser")
    @ResponseBody
    public void updateUser(User user) {
        userService.updateUser(user);
    }

    @ApiOperation("修改密码")
    @RequestMapping("updatePassword")
    @ResponseBody
    public String updatePassword(HttpSession session) {
        return null;
    }

    @ApiOperation("添加注册")
    @RequestMapping("addUser")
    @ResponseBody
    public void addUser(User user) {
        userService.addUser(user);
    }
}


