package com.lucky.pay.controller;

import com.lucky.pay.feign.OrderFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 支付控制器
 *
 * @author Waldron Ye
 * @date 2019/2/18 22:45
 */
@RestController
public class PayController {


    @Resource
    private OrderFeignClient orderFeignClient;

    @GetMapping(value = "/wxPay")
    public Object wxPay() {
        Integer orderId = 2;
        Object obj = orderFeignClient.getOrderInfoById(orderId);
        return obj;
    }

    @GetMapping(value = "/check")
    public Object check() {

        return "200";
    }
}
