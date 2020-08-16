package com.fh.utils;

import redis.clients.jedis.Jedis;

public class RedisUse {




    public static void set(String key,String value,Integer seconds){
        Jedis jedis = RedisPoolUtil.getJedisPool();
        jedis.setex(key,seconds,value);
        RedisPoolUtil.backJedis(jedis);
    }

    public static String get(String key){
        Jedis jedis = RedisPoolUtil.getJedisPool();
        String value=jedis.get(key);
        RedisPoolUtil.backJedis(jedis);
        return value;
    }




}
