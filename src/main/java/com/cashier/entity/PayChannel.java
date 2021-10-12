package com.cashier.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PayChannel {
    private Integer id;

    private String channelCode;

    private String companyName;

    private String phone;

    private LocalDateTime cooperateStartTime;

    private LocalDateTime cooperateEndTime;

    private String ourOppPerson;

    private String otherOppPerson;

    private String email;

    private Double rate;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String createByName;
}