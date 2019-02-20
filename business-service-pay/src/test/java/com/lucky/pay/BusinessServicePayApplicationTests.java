package com.lucky.pay;

import com.lucky.pay.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BusinessServicePayApplicationTests {

    @Resource
    private RedisUtil redisUtil;

    @Test
    public void contextLoads() {
    }


    @Test
    public void redisSetTest() {
        String key = "name";
        String value = "yezw";
        boolean flag = redisUtil.set(key, value);
        log.info("保存redis是否成功:flag={}", flag);
    }
}
