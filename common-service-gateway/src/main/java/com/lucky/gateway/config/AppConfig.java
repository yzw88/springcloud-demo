package com.lucky.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 应用配置
 *
 * @author Waldron Ye
 * @date 2019/2/20 23:02
 */
@Configuration
public class AppConfig {


    /**
     * 只能使用其中一种方式限流
     *
     * @return
     */
    @Bean
    public HostAddrKeyResolver hostAddrKeyResolver() {
        //根据Hostname进行限流
        return new HostAddrKeyResolver();
    }

/*    @Bean
    public UriKeyResolver uriKeyResolver() {
        //根据uri去限流
        return new UriKeyResolver();
    }

    @Bean
    KeyResolver userKeyResolver() {
        //用户的维度去限流 请求路径中必须携带userId参数
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
    }*/
}
