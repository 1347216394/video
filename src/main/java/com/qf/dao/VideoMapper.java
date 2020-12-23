package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.pojo.Video;

import java.util.List;

public interface VideoMapper extends BaseMapper<Video> {
    List<Video> findAll(Video video);
}
