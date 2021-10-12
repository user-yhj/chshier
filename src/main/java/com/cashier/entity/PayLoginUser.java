package com.cashier.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class PayLoginUser {
    private Integer id;

    private String userName;

    private String loginPassword;

    private String sex;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String createByName;
}