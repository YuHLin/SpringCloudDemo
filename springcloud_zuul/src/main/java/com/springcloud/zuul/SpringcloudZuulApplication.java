package com.springcloud.zuul;

import com.springcloud.zuul.filter.PreZuulFilter;
import com.springcloud.zuul.provider.ServiceConsumerFallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.context.annotation.Bean;

/*@SpringBootApplication
@EnableEurekaClient*/
@SpringCloudApplication
@EnableZuulProxy
public class SpringcloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZuulApplication.class, args);
	}

	@Bean
	public ZuulFallbackProvider routeDemoServiceZuulFallbackProvider() {
		ServiceConsumerFallbackProvider routeZuulFallback = new ServiceConsumerFallbackProvider();
		return routeZuulFallback;
	}

	@Bean
	public PreZuulFilter preZuulFilter(){
		return new PreZuulFilter();
	}
}
