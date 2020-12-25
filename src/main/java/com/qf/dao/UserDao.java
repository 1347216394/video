package com.qf.dao;



import com.qf.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> selectList();

    User selectById(Integer id);

    void updateUser(User user);

    void insertUser(User user);

    User selectEmailAndPassword(User user);

    User selectUserByEmail(String email);

}
