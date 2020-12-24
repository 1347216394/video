package com.qf.dao;

import com.qf.pojo.WebVideo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WebVideoDao {
    WebVideo selectById(Integer id);

    List<WebVideo> selectList();

    List<WebVideo> select(Integer id);
}
