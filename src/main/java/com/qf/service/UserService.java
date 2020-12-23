package com.qf.service;

import com.qf.pojo.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> findAll();

    User login(String email, String password);

    void updateUser(User user);

    void updatePassword(HashMap<String,Object> map);

    User findOne();
}
