package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    private Integer id;
    private String title;
    private String detail;
    private Integer time;
    private Integer speaker_id;
    private Integer course_id;
    private String video_url;
    private String image_url;
    private Integer play_num;
}