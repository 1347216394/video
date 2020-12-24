package com.qf.controller;

import com.qf.dto.WebVideoDto;
import com.qf.pojo.WebVideo;
import com.qf.service.WebVideoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("webVideo")
@Api(tags = "前端课程视频")
public class WebVideoController {
    @Autowired
    private WebVideoService webVideoService;

    @ApiOperation("查询单个视频")
    @GetMapping("showVideo")
    public WebVideoDto showVideo(Integer id) {

        return webVideoService.selectById(id);
    }

    @ApiOperation("查询所有视频")
    @GetMapping("showAll")
    public List<WebVideoDto> showAll() {

        return webVideoService.selectAll();
    }

    @ApiOperation("查询课程相关视频")
    @GetMapping("showList")
    public List<WebVideoDto> showList(Integer id) {

        return webVideoService.select(id);
    }

    @ApiOperation("更新播放量")
    @PostMapping("updatePlayNum")
    public String updatePlayNum(Integer id) {

        webVideoService.update(id);

        return "success";
    }


}
