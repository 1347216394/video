package com.qf.controller;

import com.qf.pojo.WebVideo;
import com.qf.service.WebVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("webVideo")
public class WebVideoController {
    @Autowired
    private WebVideoService webVideoService;

    @GetMapping("showVideo")
    public WebVideo showVideo(Integer id) {

        return webVideoService.selectById(id);
    }


    @GetMapping("showAll")
    public List<WebVideo> showAll() {

        return webVideoService.selectAll();
    }

    @GetMapping("showList")
    public List<WebVideo> showList(Integer id) {

        return webVideoService.select(id);
    }


}
