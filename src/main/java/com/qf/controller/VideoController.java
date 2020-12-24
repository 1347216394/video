package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dto.VideoDto;
import com.qf.pojo.Video;
import com.qf.service.VideoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("video")
@Api(tags="后台视频管理操作")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @ApiOperation("查询所有视频")
    @GetMapping("findAll")
    public PageInfo<VideoDto> findAll(String title, Integer speaker_id, Integer course_id,
                                   @RequestParam(defaultValue = "1") Integer pageSize,
                                   @RequestParam(defaultValue = "5") Integer pageNum
                                   ) {
        PageHelper.startPage(pageSize, pageNum);
        List<VideoDto> list = videoService.findAll(title, speaker_id, course_id);
        PageInfo<VideoDto> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @DeleteMapping("deleteVideo")
    @ApiOperation("删除多个视频")
    public void deleteVideo (String ids) {
        videoService.deleteVideo(ids);
    }

    @DeleteMapping("deleteVideoById")
    @ApiOperation("删除单个视频")
    public void deleteVideoById (Integer id) {
        videoService.deleteVideoById(id);
    }

    @PostMapping("insertVideo")
    @ApiOperation("插入视频")
    public void insertVideo (Video video) {
        videoService.insertVideo(video);
    }

    @PutMapping("updateVideo")
    @ApiOperation("更改视频")
    public void updateVideo (Video video) {
        videoService.updateVideo(video);
    }

    @GetMapping("fingVideoById")
    @ApiOperation("根据id查找一个视频")
    public Video fingVideoById (Integer id) {
        return videoService.findVideoById(id);
    }
}
