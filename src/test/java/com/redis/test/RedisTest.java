package com.redis.test;

import com.jk.controller.TestController;
import com.jk.entity.User;
import com.jk.service.BaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@WebAppConfiguration("src/main/resources")
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTest {

    @Autowired
    private BaseService baseService;

    @Autowired
    private TestController controller;


    @Test
    public void redisConnectionTest() {
//        Jedis test = new Jedis("127.0.0.1",6379);
////        test.set("hw","hello world");
//        String name = test.get("name");
//        System.out.println(name);
//        redisCache.clear();

    }

    @Test
    public void insertUserTest() {
        User user = new User();
        for (int i =348425;i<=348425;i++){
            user.setUsercode("jk"+i);
            user.setPassword("jk123");
            user.setUsername("蒋康"+i);
            boolean bol = baseService.registUser(user);
            System.out.println(bol);
        }
    }

    @Test
    public void selectAllUserTest() {
        long start1 = System.currentTimeMillis();
        List<User> users1 = baseService.findAllUser();
        long end1 = System.currentTimeMillis();
        long resulttime1 = end1 - start1;
        System.out.println("第一次查询共用了" + resulttime1 + "毫秒");
        long start2 = System.currentTimeMillis();
        List<User> users2 = baseService.findAllUser();
        long end2 = System.currentTimeMillis();
        long resulttime2 = end2 - start2;
        System.out.println("第一次查询共用了" + resulttime2 + "毫秒");
    }

    @Test
    public void loginTest(){
        User user = new User();
        user.setUsercode("jk1");
        user.setPassword("jk123");
        controller.login(user);

    }
}
