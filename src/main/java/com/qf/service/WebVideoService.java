package com.qf.service;

import com.qf.dto.WebVideoDto;
import com.qf.pojo.WebVideo;

import java.util.List;

public interface WebVideoService {
    WebVideoDto selectById(Integer id);

    List<WebVideoDto> selectAll();

    List<WebVideoDto> select(Integer id);

    void update(Integer id);
}
