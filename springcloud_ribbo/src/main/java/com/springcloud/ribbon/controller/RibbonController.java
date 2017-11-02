package com.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Lin
 * @Date 2017/11/2.
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/template")
    public String doSomeThing(String name){
        System.out.println("执行了Temolate负载均衡");
        return restTemplate.getForObject("http://client-service/add",String.class);
    }
}
