package com.cashier.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class PayOrder {
    private Integer id;

    private String orderid;

    private String channelcode;

    private Long amount;

    private String paystate;

    private String channeluserid;

    private String payname;

    private String openid;

    private String phone;

    private String idcardno;

    private String cardtype;

    private LocalDateTime createtime;

    private LocalDateTime updatetime;

    private String createbyname;

    private String orderobject;
}