package com.mttsui.scloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author: zsxu2
 * @Date 2018/10/18 23:22
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApp {

    public static void main(String[] args) {

        SpringApplication.run(FeignApp.class, args);
    }
}
