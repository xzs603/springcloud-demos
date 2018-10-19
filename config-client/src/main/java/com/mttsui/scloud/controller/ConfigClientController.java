package com.mttsui.scloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zsxu2
 * @Date 2018/10/19 18:29
 */
@RefreshScope
@RestController
public class ConfigClientController {

    //@Value("${config.foo}")
    private String foo = "123";

    @GetMapping("foo")
    public String foo() {
        return foo;
    }
}
