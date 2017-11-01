package com.springcloud.cilent2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lin
 * @Date 2017/11/1.
 */

@RestController
public class Client2Controller {

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String div(){
        System.out.println("执行了div方法");
        return "Spring Cloud Functiomn div";
    }
}
