package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    //    查询所有
    @Override
    public List<User> findAll() {
        return userDao.selectList(null);
    }

    //    登陆
    @Override
    public User login(String email, String password) {
        User user = userDao.selectById(email);
        if (email == null) {
            System.out.println("用户名错误！");
        }
        if (!email.equals(password)){
            System.out.println("密码错误!");
        }
        return user;
    }

    @Override
    public void updateUser(User user) {
        userDao.updateById(user);
    }

    @Override
    public User selectUserByEmail(String email) {
        return userDao.selectById(email);
    }

    @Override
    public User findById(long id) {
        return userDao.selectById(id);
    }

    @Override
    public void addUser(User user) {
        userDao.insert(user);
        if (user != null) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }


}


