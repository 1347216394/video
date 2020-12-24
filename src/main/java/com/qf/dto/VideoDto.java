package com.qf.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoDto {
    private Integer id;
    private String title;
    private String detail;
    private Integer time;
    @ApiModelProperty("讲师名字")
    private String speaker_name;
}
