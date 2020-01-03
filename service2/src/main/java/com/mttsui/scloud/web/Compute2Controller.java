package com.mttsui.scloud.web;

/**
 * @Author: zsxu2
 * @Date 2018/10/18 22:05
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zsxu2
 * @Date 2018/10/18 22:04
 */
@RequestMapping("/compute2")
@RestController
public class Compute2Controller {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name") String name){
        return "hello2, " + name;
    }

    @GetMapping("/add")
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
