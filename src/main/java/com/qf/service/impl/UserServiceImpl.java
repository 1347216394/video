package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

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
        return user;
    }

    @Override
    public void updateUser(User user) {
        userDao.updateById(user);
    }

    @Override
    public void updatePassword(HashMap<String, Object> map) {

    }

    @Override
    public User findOne() {
        return userDao.selectOne(null);
    }


}


