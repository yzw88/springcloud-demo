package com.lucky.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 网关启动类
 *
 * @author Waldron Ye
 * @date 2019/2/20 0:09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CommonServiceGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonServiceGatewayApplication.class, args);
    }

}
