package com.springcloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("demo")
public class SpringcloudClientApplication {

	@RequestMapping("/test")
	public String Demo(){
		return "Spring Cloud Demo!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudClientApplication.class, args);
	}
}
