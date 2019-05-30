package com.zjx;

import com.zjx.utils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-05-30 20:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    @Test
    public void testString(){
        redisUtils.set("qqq","www");
        String result= (String) redisUtils.get("qqq");
        System.out.println(result);
    }

    @Test
    public void testString2(){
        //注意这里的 key不能为null spring 内部有检验
        redisTemplate.opsForValue().set("111", "aaa");
        System.out.println(redisTemplate.opsForValue().get("111"));
    }
}
