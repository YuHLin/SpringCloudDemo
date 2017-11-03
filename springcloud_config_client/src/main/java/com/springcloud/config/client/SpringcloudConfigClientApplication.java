package com.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
/**
 *
 * @RefreshScope
 * 标注需要自动更新配置变量的Java类
 *
 * 需要更新是执行  curl -X POST http://localhost:8881/bus/refresh
 */
public class SpringcloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigClientApplication.class, args);
	}

	@Value("${config.dev}")
	private String foo;

	@RequestMapping(value = "/sayFoo")
	public String sayFoo(){
		return foo;
	}
}
