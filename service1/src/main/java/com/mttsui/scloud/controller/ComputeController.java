package com.mttsui.scloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @GetMapping("/hello")
    public String hello(){
        logger.info("get hello");
        logger.error("get hello");
        return "hello1";
    }

    @GetMapping("/add")
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
