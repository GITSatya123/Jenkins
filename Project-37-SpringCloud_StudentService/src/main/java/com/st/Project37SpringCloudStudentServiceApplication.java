package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Project37SpringCloudStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project37SpringCloudStudentServiceApplication.class, args);
	}

}
