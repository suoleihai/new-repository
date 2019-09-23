package com.mr.domain.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Table(name = "t_address")
public class Address {
    @Id
    @Column(name = "address_id")
    private Integer addressId;//地址id

    @Column(name = "address_recieve")
    private String addressRecieve;//选择所在地

    @Column(name = "address_recievename")
    private String addressRecievename;//收件人姓名

    @Column(name = "address_detail")
    private String addressDetail;//街道地址

    @Column(name = "address_mailcode")
    private String addressMailcode;//邮政编码

    @Column(name = "address_phone")
    private String addressPhone;//手机号码
}
