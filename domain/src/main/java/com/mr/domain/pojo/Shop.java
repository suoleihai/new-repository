package com.mr.domain.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "t_shops")
public class Shop {

    @Id
    @Column(name = "shop_id")
    private Integer shopId; // 商家ID

    @Column(name = "enter_id")
    private Integer enterId; // 商家入驻ID

    @Column(name = "shop_phone")
    private String phone; // 商家电话

    @Column(name = "shop_specidlty")
    private String specidity; // 特色菜品

    @Column(name = "shop_discounts")
    private String discounts; // 优惠活动

    @Column(name = "shop_parknumber")
    private Integer parkNumber; // 停车位数量

    @Column(name = "shop_parkcost")
    private Integer parkCost; // 停车位是否收费

    @Column(name = "shop_openTime")
    private String openTime; // 开始营业时间

    @Column(name = "shop_closeTime")
    private String closeTime; // 结束营业时间

    @Column(name = "shop_wifi")
    private Integer wifi; // 是否有wifi

    @Column(name = "shop_price")
    private Double price; // 人均价格

}
