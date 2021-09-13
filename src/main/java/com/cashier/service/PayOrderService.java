package com.cashier.service;

import com.cashier.entity.PayOrder;

import java.util.List;

public interface PayOrderService {
    List<PayOrder> selectPayOrderList();

}
