package com.qf.service;

import com.qf.pojo.WebVideo;

import java.util.List;

public interface WebVideoService {
    WebVideo selectById(Integer id);

    List<WebVideo> selectAll();

    List<WebVideo> select(Integer id);

}
