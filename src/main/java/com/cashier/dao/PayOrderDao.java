package com.cashier.dao;


import com.cashier.entity.PayOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PayOrderDao {
    List<PayOrder> selectPayOrderList();
}
