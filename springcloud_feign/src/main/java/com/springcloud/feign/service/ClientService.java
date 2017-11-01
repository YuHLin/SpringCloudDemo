package com.springcloud.feign.service;

import com.springcloud.feign.service.Impl.ClientServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Lin
 * @Date 2017/11/1.
 */
@FeignClient(value = "client-service",fallback = ClientServiceHystrix.class)
public interface ClientService {

    /**
     * Client Service 接口
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    String add();
}
