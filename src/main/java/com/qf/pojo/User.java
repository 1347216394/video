package com.qf.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户")
public class User {

  @ApiModelProperty("用户编号")
  private long id;
  @ApiModelProperty("用户邮箱")
  private String email;
//  private String phoneNum;
  @ApiModelProperty("用户密码")
  private String password;
  private String code;
//  private String nickName;
  @ApiModelProperty("用户性别")
  private String sex;
  @ApiModelProperty("用户生日")
  private String birthday;
  @ApiModelProperty("用户地址")
  private String address;
//  private String imgUrl;
//  private java.sql.Timestamp createTime;

}
