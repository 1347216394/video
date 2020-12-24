package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.dto.VideoDto;
import com.qf.pojo.Video;

import java.util.List;

public interface VideoMapper extends BaseMapper<Video> {
    List<VideoDto> findAll(String title, Integer speaker_id, Integer course_id);
}
