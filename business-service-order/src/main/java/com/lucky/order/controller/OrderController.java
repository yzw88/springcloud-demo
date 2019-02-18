package com.lucky.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单控制器
 *
 * @author Waldron Ye
 * @date 2019/2/18 22:56
 */
@RestController
public class OrderController {


    @GetMapping(value = "/getOrderInfoById")
    public Object getOrderInfoById(Integer orderId) {
        Map<String, Object> map = new HashMap<>(3);
        map.put("orderId", orderId);
        map.put("orderName", "测试商品");
        map.put("phone", "10010");
        return map;
    }
}
