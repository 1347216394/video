package com.qf.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.dao.SpeakerMapper;
import com.qf.pojo.Speaker;
import com.qf.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class SpeakerServiceImpl implements SpeakerService {
    @Autowired
    private SpeakerMapper speakerMapper;

    @Override
    public List<Speaker> selectList(QueryWrapper queryWrapper) {
        return speakerMapper.selectList(null);
    }

    @Override
    public Speaker selectById(Integer id) {
        return speakerMapper.selectById(id);
    }

    @Override
    public void deleteById(Integer id) {
        speakerMapper.deleteById(id);
    }

    @Override
    public void insert(Speaker speaker) {
        speakerMapper.insert(speaker);
    }

    @Override
    public void updateById(Speaker speaker) {
        speakerMapper.updateById(speaker);
    }

    @Override
    public void deleteByIds(String[] ids) {
        speakerMapper.deleteBatchIds(Arrays.asList(ids));
    }
}
