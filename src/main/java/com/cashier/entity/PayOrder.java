package com.cashier.entity;


import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PayOrder {
    private int id;
    private String orderId;
    private String channelCode;
    private BigDecimal amount;
    private String payState;
    private String channelUserId;
    private String payName;
    private String openId;
    private String phone;
    private String idCardNo;
    private String cardType;
    private String orderObject;
    private Date createTime;
    private Date updateTime;
    private String createByName;
}
