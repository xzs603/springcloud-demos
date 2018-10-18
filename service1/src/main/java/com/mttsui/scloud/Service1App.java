package com.mttsui.scloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zsxu2
 * @Date 2018/10/18 21:34
 */
@SpringBootApplication
@EnableEurekaClient
public class Service1App {

    public static void main(String[] args) {
        SpringApplication.run(Service1App.class, args);
    }
}
