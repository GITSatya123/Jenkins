package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Project33SpringCloudBranchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project33SpringCloudBranchServiceApplication.class, args);
	}

}
