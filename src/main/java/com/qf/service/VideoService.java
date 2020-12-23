package com.qf.service;

import com.qf.pojo.Video;

import java.util.List;

public interface VideoService {
    List<Video> findAll(Video video);
}
