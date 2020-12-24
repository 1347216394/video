package com.qf.service.impl;

import com.qf.dao.SubjectDao;
import com.qf.pojo.Subject;
import com.qf.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectDao subjectDao;

    @Override
    public List<Subject> selectAll() {
        return subjectDao.selectList();
    }

    @Override
    public Subject selectOne(Integer id) {
        return subjectDao.selectById(id);
    }
}
