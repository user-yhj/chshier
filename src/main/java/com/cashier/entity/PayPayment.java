package com.cashier.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class PayPayment {
    private Integer id;

    private String orderId;

    private String state;

    private String callBackState;

    private String message;

    private String callBackType;

    private String channelCode;

    private Double amount;

    private String payState;

    private String payName;

    private String phone;

    private String idCardNo;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String createByName;
}