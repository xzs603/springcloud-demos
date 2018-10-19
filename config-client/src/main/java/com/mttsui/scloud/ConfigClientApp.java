package com.mttsui.scloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zsxu2
 * @Date 2018/10/19 18:27
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApp.class, args);
    }
}
