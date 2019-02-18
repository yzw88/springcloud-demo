package com.lucky.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * pay启动类
 *
 * @author Waldron Ye
 * @date 2019/2/18 22:41
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class BusinessServicePayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessServicePayApplication.class, args);
    }

}
