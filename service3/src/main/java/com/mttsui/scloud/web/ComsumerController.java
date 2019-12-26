package com.mttsui.scloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zsxu2
 * @Date 2018/10/18 22:25
 */
@RequestMapping("/consumer")
@RestController
public class ComsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public String add() {
        return restTemplate.getForEntity("http://SERVICE1/compute/hello", String.class).getBody();
    }
}
