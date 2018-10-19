package com.mttsui.scloud.controller;

import com.mttsui.scloud.client.ComputeClient;
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

    @GetMapping("hello")
    public String hello() {
        return computeClient.hello();
    }
}
