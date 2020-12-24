package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Speaker {
    private Integer id;
    private String speaker_name;
    private String speaker_desc;
    private String speaker_job;
    private String head_img_url;

    @Override
    public String toString() {
        return "Speaker{" +
                "id=" + id +
                ", speaker_name='" + speaker_name + '\'' +
                ", speaker_desc='" + speaker_desc + '\'' +
                ", speaker_job='" + speaker_job + '\'' +
                ", head_img_url='" + head_img_url + '\'' +
                '}';
    }
}
