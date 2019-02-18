package com.lucky.pay.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient("business-service-order")
public interface  OrderFeignClient {

    @GetMapping(value = "/getOrderInfoById")
    Map<String, Object> getOrderInfoById(Integer orderId);
}
