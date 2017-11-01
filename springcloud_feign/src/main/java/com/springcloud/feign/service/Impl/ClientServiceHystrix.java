package com.springcloud.feign.service.Impl;

import com.springcloud.feign.service.ClientService;
import org.springframework.stereotype.Component;

/**
 * @author Lin
 * @Date 2017/11/1.
 */
@Component
public class ClientServiceHystrix implements ClientService {
    @Override
    public String add() {
        return "Spring Cloud断路器触发！！！！！";
    }
}
