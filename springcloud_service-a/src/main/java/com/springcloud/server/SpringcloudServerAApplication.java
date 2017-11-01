package com.springcloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudServerAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServerAApplication.class, args);
	}
}
