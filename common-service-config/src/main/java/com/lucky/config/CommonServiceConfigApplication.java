package com.lucky.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * config 启动类
 *
 * @author Waldron Ye
 * @date 2019/2/22 23:18
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class CommonServiceConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonServiceConfigApplication.class, args);
    }

}
