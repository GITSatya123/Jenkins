package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Project51SpringBootApiGatewayApiZullServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project51SpringBootApiGatewayApiZullServerApplication.class, args);
	}

}
