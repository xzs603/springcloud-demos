package com.mttsui.scloud.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: zsxu2
 * @Date 2018/11/20 20:15
 */
@FeignClient(value = "/feign")
@Repository
public interface Feign1Client {

    @GetMapping("/call")
    String call ();
}
