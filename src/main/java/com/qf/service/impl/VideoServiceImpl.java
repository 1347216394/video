package com.qf.service.impl;

import com.qf.dao.VideoMapper;
import com.qf.dto.VideoDto;
import com.qf.pojo.Video;
import com.qf.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<VideoDto> findAll(String title, Integer sid, Integer cid) {
       return videoMapper.findAll(title, sid, cid);
    }

    @Override
    public void deleteVideo(String ids) {
        videoMapper.deleteBatchIds(Arrays.asList(ids));
    }

    @Override
    public void deleteVideoById(Integer id) {
        videoMapper.deleteById(id);
    }

    @Override
    public void insertVideo(Video video) {
        videoMapper.insert(video);
    }

    @Override
    public void updateVideo(Video video) {
        videoMapper.updateById(video);
    }

    @Override
    public Video findVideoById(Integer id) {
      return videoMapper.selectById(id);
    }
}
