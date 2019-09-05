package com.mttsui.scloud.controller;

import com.mttsui.scloud.client.ComputeClient;
import com.mttsui.scloud.client.Feign1Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zsxu2
 * @Date 2018/10/18 23:24
 */
@RestController
public class FeignController {

    @Autowired
    private ComputeClient computeClient;

    @Autowired
    private Feign1Client feign1Client;

    @GetMapping("/hello")
    public String hello() {
        return computeClient.hello();
    }

    @GetMapping("/hello2")
    public String hello2() {
        return feign1Client.call();
    }

    @GetMapping("/call")
    public String call() {
        boolean iserr = true;
        if (iserr) throw new RuntimeException("call error");
        return "call feign";
    }
}
