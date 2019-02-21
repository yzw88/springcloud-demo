package com.lucky.pay.feign.fallback;

import com.lucky.pay.feign.OrderFeignClient;
import org.springframework.stereotype.Component;

@Component
public class OrderFeignClientHystric implements OrderFeignClient {
    @Override
    public Object getOrderInfoById(Integer orderId) {
        return "Sorry!!! The order service was error...";
    }
}
