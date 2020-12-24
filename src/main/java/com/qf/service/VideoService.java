package com.qf.service;

import com.qf.dto.VideoDto;
import com.qf.pojo.Video;

import java.util.List;

public interface VideoService {
    List<VideoDto> findAll(String title, Integer sid, Integer cid);

    void deleteVideo(String ids);

    void deleteVideoById(Integer id);

    void insertVideo(Video video);

    void updateVideo(Video video);

    Video findVideoById(Integer id);
}
