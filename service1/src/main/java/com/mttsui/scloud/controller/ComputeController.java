package com.mttsui.scloud.controller;

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

    @GetMapping("add")
    public int add(int a, int b) {
        return a + b;
    }
}
