package com.mttsui.scloud.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: zsxu2
 * @Date 2018/10/18 23:24
 */
@FeignClient("service1")
public interface ComputeClient {

    @GetMapping("compute/hello")
    String hello();
}
