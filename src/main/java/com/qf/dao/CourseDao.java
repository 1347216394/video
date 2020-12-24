package com.qf.dao;

import com.qf.pojo.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDao {

    Course selectById(Integer id);

    List<Course> selectList();

    List<Course> select(Integer id);

}
