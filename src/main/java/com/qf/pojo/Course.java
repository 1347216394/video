package com.qf.pojo;

import com.qf.dto.WebVideoDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    private Integer id;
    private String courseTitle;
    private String courseDesc;
    private Integer subjectId;
    private List<WebVideoDto> webVideoList;
}
