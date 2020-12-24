package com.qf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebVideoDto {
    private Integer id;
    private String title;
    private String detail;
    private Integer time;
    private Integer speakerId;
    private Integer courseId;
    private String videoUrl;
    private String imageUrl;
    private Integer playNum;
    private String speakerName;
    private String speakerDesc;
    private String speakerJob;
    private String headImgUrl;
}
