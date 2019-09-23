package com.mr.domain.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "t_user")
public class User {
   @Id
   @Column(name = "user_id")
   private Integer userId;//Id

   @Column(name = "user_account")
   private String userAccount;//用户账号

   @Column(name = "user_password")
   private String userPassword;//用户密码

   @Column(name = "user_name")
   private String userName;//用户姓名

   @DateTimeFormat(pattern = "yyyy-MM-dd")
   @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
   @Column(name = "user_date")
   private Date userDate;//创建时间

}
