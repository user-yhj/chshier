package com.cashier.service.impl;

import com.cashier.dao.PayOrderDao;
import com.cashier.entity.PayOrder;
import com.cashier.service.PayOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PayOrderServiceImpl implements PayOrderService {
    @Autowired
    private PayOrderDao payOrderDao;

    //查询所有订单信息
    public List<PayOrder> selectPayOrderList() {
        return payOrderDao.selectPayOrderList();
    }

}
