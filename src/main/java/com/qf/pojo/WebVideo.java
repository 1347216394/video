package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebVideo {

    private Integer id;

    private String title;

    private String detail;

    private Integer time;

    private Integer speakerId;

    private Integer courseId;

    private String videoUrl;

    private String imageUrl;

    private Integer playNum;
}
