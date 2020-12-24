package com.qf.dao;


import com.qf.pojo.Subject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectDao {

    Subject selectById(Integer id);

    List<Subject> selectList();
}
