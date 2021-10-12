package com.cashier.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PayChannelUser {
    private Integer id;

    private String createByName;

    private String channelCode;

    private String channelUserId;

    private String openId;

    private String sex;

    private String cardType;

    private String idCardNo;

    private String channelName;

    private String birthdayDate;

    private String idCardStartTime;

    private String idCardEndTime;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}