package com.qf.service.impl;

import com.qf.dao.WebVideoDao;
import com.qf.pojo.WebVideo;
import com.qf.service.WebVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebVideoServiceImpl implements WebVideoService {
    @Autowired
    private WebVideoDao webVideoDao;


    @Override
    public WebVideo selectById(Integer id) {
        WebVideo webVideo = webVideoDao.selectById(id);
        return webVideo;
    }

    @Override
    public List<WebVideo> selectAll() {
        return webVideoDao.selectList();
    }

    @Override
    public List<WebVideo> select(Integer id) {
        return webVideoDao.select(id);
    }


}
