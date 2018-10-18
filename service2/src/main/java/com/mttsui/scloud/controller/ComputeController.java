package com.mttsui.scloud.controller;

/**
 * @Author: zsxu2
 * @Date 2018/10/18 22:05
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zsxu2
 * @Date 2018/10/18 22:04
 */
@RequestMapping("compute")
@RestController
public class ComputeController {

    @GetMapping("hello")
    public String hello(){
        return "hello2";
    }

    @GetMapping("add")
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
