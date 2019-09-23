package com.mr.domain.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "t_commodity")
public class Commodity {

    @Id
    @Column(name = "com_id")
    private Integer comId; // 商品ID

    @Column(name = "shop_id")
    private Integer shopId; // 商家ID

    @Column(name = "com_name")
    private String comName; // 菜品名称

    @Column(name = "com_original_cost")
    private Double originalCost; // 原价

    @Column(name = "com_promotion_price")
    private Double promotionPrice; // 促销价

    @Column(name = "com_monthly_sales")
    private Integer monthlySales; // 月销量

    @Column(name = "com_inventory")
    private Integer inventory; // 库存

    @Column(name = "com_detal_info")
    private String detalInfo; // 详细信息



}
