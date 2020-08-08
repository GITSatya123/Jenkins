package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Project35SpringCloudCourceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project35SpringCloudCourceServiceApplication.class, args);
	}

}
