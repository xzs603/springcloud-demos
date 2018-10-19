package com.mttsui.scloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: zsxu2
 * @Date 2018/10/18 23:32
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp.class, args);
    }
}
