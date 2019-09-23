package com.mr.domain.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "t_enter")//上架入驻表
public class Enter {
    @Column(name = "enter_id")
    @Id
    private Integer enterId;
    //店铺名称
    @Column(name = "enter_name")
    private String  enterName;
    //商家手机号
    @Column(name = "enter_phone")
    private String enterPhone;
    //身份证号
    @Column(name = "enter_pname")
    private String enterPname;
    //营业执照
    @Column(name = "enter_number")
    private String enterNumber;
    //法人代表
    @Column(name = "enter_license")
    private String enterLicense;
    //商家地址
    @Column(name = "enter_address")
    private String enterAddress;

}
