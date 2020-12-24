package com.qf.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("视频管理")
public class Video {
    private Integer id;
    private String title;
    private String detail;
    private Integer time;
    @ApiModelProperty("讲师id")
    private Integer speaker_id;
    private Integer course_id;
    private String video_url;
    private String image_url;
    private Integer play_num;
}
