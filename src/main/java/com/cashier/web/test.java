package com.cashier.web;

import com.cashier.entity.PayOrder;
import com.cashier.service.PayOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
//王莹
@Controller
@RequestMapping("/test")
public class test {
    @Autowired
    private PayOrderService payOrderService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "HELLO WORD";
    }

    @RequestMapping("/indexHtml")
    public String indexHtml(){
        return "test";
    }

    @RequestMapping("/happy")
    @ResponseBody
    public String happy(){
        PayOrder payOrder = new PayOrder();
        List<PayOrder> payOrders = payOrderService.selectPayOrderList();

        return payOrders.toString();
    }


}