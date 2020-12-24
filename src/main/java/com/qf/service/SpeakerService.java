package com.qf.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.pojo.Speaker;
import io.swagger.models.auth.In;

import java.util.List;

public interface SpeakerService {
    List<Speaker> selectList(QueryWrapper queryWrapper);
    Speaker selectById(Integer id);

    void deleteById(Integer id);

    void insert(Speaker speaker);

    void updateById(Speaker speaker);


    void deleteByIds(String[] ids);
}
