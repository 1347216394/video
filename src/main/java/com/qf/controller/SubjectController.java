package com.qf.controller;

import com.qf.pojo.Subject;
import com.qf.service.SubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("subject")
@Api(tags = "前端页面课程种类")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @ApiOperation("查询所有课程种类")
    @GetMapping("selectAll")
    public List<Subject> selectAll() {

        return subjectService.selectAll();
    }

    @ApiOperation("查询指定课程种类")
    @GetMapping("selectOne")
    public Subject selectOne(Integer id) {

        return subjectService.selectOne(id);
    }


}
