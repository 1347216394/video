package com.qf.service;

import com.qf.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> findAll();

    User login(String email, String password);

    void updateUser(User user);

    Map<String, Object> updateOne(String email,String password);

    User findOne();

    void addUser(User user);
}
