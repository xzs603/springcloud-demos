package com.mttsui.scloud.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mttsui.scloud.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zsxu2
 * @Date 2018/10/18 22:04
 */
@RequestMapping("/compute")
@RestController
public class ComputeController {

    private static Logger logger = LoggerFactory.getLogger(ComputeController.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/hello")
    public String hello(){
        logger.info("get hello");
        logger.error("get hello");
        User user = new User( "张三丰", 102);
        try {
            String userStr = objectMapper.writeValueAsString(user);

            stringRedisTemplate.opsForValue().set("name", userStr);
            String obj = stringRedisTemplate.opsForValue().get("name");
            logger.info(obj);
            User user2 = objectMapper.readValue(obj, User.class);
            logger.info(user2.toString());
//          throw new IllegalAccessException("ok");
        } catch (Exception e) {
            logger.error("error occur", e);
        }
        return "hello1";
    }

    @GetMapping("/add")
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
