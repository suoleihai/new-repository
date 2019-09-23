package com.mr.domain.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * @author piper
 * @date 2019/9/18 19:11
 */
@Data
@Table(name = "t_order")
public class Order {
    @Column(name = "order_id")
    @Id
    private String orderId;//订单主键

    //商家id
    @Column(name = "shop_id")
    private Integer shopId;

    //用户id
    @Column(name = "user_id")
    private Integer userId;

    //商品id
    @Column(name = "com_id")
    private Integer comId;

    //订单日期
    @Column(name = "order_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date orderDate;

    //订单金额
    @Column(name = "order_money")
    private Double orderMoney;

    //订单状态
    @Column(name = "order_status")
    private Integer orderStatus;

    //用户实体
    private User user;

    //商品集合
    private List<Commodity> comList;

}
