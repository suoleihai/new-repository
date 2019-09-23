package com.mr.domain.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "t_discount")
public class Discount {

  @Id
  @Column(name = "discount_id")
  private Integer discountId;//优惠券ID

  @Column(name = "shop_id")
  private Integer shopId; //商家ID  外键

  @Column(name = "user_id")
  private Integer userId; //用户ID  外键

  @Column(name = "discount_name")
  private String discountName; //优惠券名称

  @Column(name = "discount_type")
  private Integer discountType; //优惠券类型

  @Column(name = "discount_begin")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd",timezone = "JMT + 8")
  private Date discountBegin;  //有限期之开始时间

  @Column(name = "discount_end")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd",timezone = "JMT + 8")
  private Date discountEnd; //有效期之结束时间

  @Column(name = "discount_condition")
  private String discountCondition; //使用条件

  @Column(name = "discount_money")
  private Integer discountMoney;  //面值

  @Column(name = "discount_number")
  private Integer discountNumber; //数量

  @Column(name = "discount_status")
  private Integer discountStatus; //状态

  private Shop shop;//引入商家表
  private User user;//引入用户表


}
