package com.springcloud.client.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lin
 * @Date 2017/11/1.
 */
@RestController
public class ComputeController {

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        System.out.println("执行了add方法");
        return "Spring Cloud Functiomn Add";
    }
}
