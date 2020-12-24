package com.qf.controller;

import com.qf.pojo.Course;
import com.qf.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("findOne")
    public Course findOne(Integer id) {
        return courseService.selectById(id);
    }

    @GetMapping("findAll")
    public List<Course> findAll() {
        return courseService.selectList();
    }

}
