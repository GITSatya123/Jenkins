package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class Project31SpringCloudProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project31SpringCloudProductServiceApplication.class, args);
	}

}
 