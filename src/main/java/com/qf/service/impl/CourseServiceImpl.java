package com.qf.service.impl;

import com.qf.dao.CourseDao;
import com.qf.pojo.Course;
import com.qf.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;

    @Override
    public Course selectById(Integer id) {
        return courseDao.selectById(id);
    }

    @Override
    public List<Course> selectList() {
        return courseDao.selectList();
    }
}
