package com.redis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import redis.clients.jedis.Jedis;

@WebAppConfiguration("src/main/resources")
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTest {

    @Test
    public void redisConnectionTest(){
        Jedis test = new Jedis("127.0.0.1",6379);
//        test.set("hw","hello world");
        String name = test.get("name");
        System.out.println(name);

    }

}
