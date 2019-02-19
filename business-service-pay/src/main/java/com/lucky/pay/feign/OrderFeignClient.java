package com.lucky.pay.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("business-service-order")
public interface OrderFeignClient {

    /**
     * 获取订单信息
     *
     * @param orderId 订单id
     * @return
     */
    @GetMapping(value = "/getOrderInfoById")
    Object getOrderInfoById(@RequestParam("orderId") Integer orderId);
}
