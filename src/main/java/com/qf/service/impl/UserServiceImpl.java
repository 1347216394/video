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
    public List<User> selectList() {
        return userDao.selectList();
    }

    //    登陆
    @Override
    public User selectEmailAndPassword(User user) {
        return userDao.selectEmailAndPassword(user);
    }

//    //    登陆
//    @Override
//    public User login(String email, String password) {
//        User user = userDao.selectById(email);
//        if (email == null) {
//            System.out.println("用户名错误！");
//        }
//        if (!email.equals(password)) {
//            System.out.println("密码错误!");
//        }
//        return user;
//    }

    //    添加用户
    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
        if (user != null) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    @Override
    public User selectUserByEmail(String email) {
        return userDao.selectUserByEmail(email);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }


    //    根据id查找
    @Override
    public User selectById(Integer id) {
        return userDao.selectById(id);
    }

}


