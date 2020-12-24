package com.qf.controller;

import com.qf.pojo.Course;
import com.qf.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("course")
@Api(tags = "前端页面课程")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @ApiOperation("前端指定主题课程")
    @GetMapping("findOne")
    public Course findOne(Integer id) {
        return courseService.selectById(id);
    }

    @ApiOperation("查询所有课程")
    @GetMapping("findAll")
    public List<Course> findAll() {
        return courseService.selectList();
    }

}
