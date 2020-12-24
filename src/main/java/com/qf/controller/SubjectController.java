package com.qf.controller;

import com.qf.pojo.Subject;
import com.qf.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("selectAll")
    public List<Subject> selectAll() {

        return subjectService.selectAll();
    }

    @GetMapping("selectOne")
    public Subject selectOne(Integer id) {

        return subjectService.selectOne(id);
    }


}
