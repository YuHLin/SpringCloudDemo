package com.springcloud.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lin
 * @Date 2017/11/1.
 */
@RestController
@RequestMapping(value = "/api-b")
public class DemoApiController {

    @RequestMapping(value = "/testb")
    public String demo(){
        return "Spring Cloud Function of api-b ..... ";
    }

}
