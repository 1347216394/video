package com.qf.service.impl;

import com.qf.dao.WebVideoDao;
import com.qf.dto.WebVideoDto;
import com.qf.service.WebVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebVideoServiceImpl implements WebVideoService {
    @Autowired
    private WebVideoDao webVideoDao;


    @Override
    public WebVideoDto selectById(Integer id) {
        WebVideoDto webVideo = webVideoDao.selectById(id);
        return webVideo;
    }

    @Override
    public List<WebVideoDto> selectAll() {
        return webVideoDao.selectList();
    }

    @Override
    public List<WebVideoDto> select(Integer id) {
        return webVideoDao.select(id);
    }

    @Override
    public void update(Integer id) {
        webVideoDao.update(id);
    }


}
