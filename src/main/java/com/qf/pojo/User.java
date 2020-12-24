package com.qf.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private Integer id;
  private String email;
  private String phoneNum;
  private String password;
  private String code;
  private String nickName;
  private String sex;
  private String birthday;
  private String address;
  private String imgUrl;
  private Date createTime;

}
