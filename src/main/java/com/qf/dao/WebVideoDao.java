package com.qf.dao;

import com.qf.dto.WebVideoDto;
import com.qf.pojo.WebVideo;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface WebVideoDao {
    WebVideoDto selectById(Integer id);

    List<WebVideoDto> selectList();

    List<WebVideoDto> select(Integer id);

    void update(Integer id);
}
