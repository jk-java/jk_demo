package com.jk.aop;

import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

public class RedisCacheAspect  {

    @Resource
    private Jedis jedis;



}
