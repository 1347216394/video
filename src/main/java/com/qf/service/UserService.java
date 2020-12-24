package com.qf.service;

import com.qf.pojo.User;

import java.util.List;

public interface UserService {

    List<User> selectList();

    User selectEmailAndPassword(User user);

    void insertUser(User user);

    User selectUserByEmail(String email);


    User updateUser(User user);

    User selectById(Integer id);
}
