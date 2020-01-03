package com.mttsui.scloud.web;

import com.mttsui.scloud.config.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hystrix")
@RestController
public class HystrixController {

    @Autowired
    private HelloRemote helloRemote;

    @GetMapping("/hello")
    public String hello(String name){
        return helloRemote.hello(name);
    }
}
