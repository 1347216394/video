package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.Video;
import com.qf.service.VideoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("video")
@Api(tags="视频管理操作")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @ApiOperation("查询所有用户")
    @GetMapping("findAll")
    public PageInfo<Video> findAll(Video video,
                                   @RequestParam(defaultValue = "1") Integer pageSize,
                                   @RequestParam(defaultValue = "5") Integer pageNum
                                   ) {
        PageHelper.startPage(pageSize, pageNum);
        List<Video> list = videoService.findAll(video);
        PageInfo<Video> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
