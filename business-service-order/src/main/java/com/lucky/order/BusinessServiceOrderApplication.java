package com.lucky.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * order启动类
 *
 * @author Waldron Ye
 * @date 2019/2/18 23:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BusinessServiceOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessServiceOrderApplication.class, args);
    }

}
