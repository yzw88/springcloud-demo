package com.lucky.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka启动类
 *
 * @author Waldron Ye
 * @date 2019/2/18 22:32
 */
@Slf4j
@SpringBootApplication
@EnableEurekaServer
public class CommonServiceEurekaApplication {

    public static void main(String[] args) {
        log.info("common-service-eureka  start=====");
        SpringApplication.run(CommonServiceEurekaApplication.class, args);
    }

}
