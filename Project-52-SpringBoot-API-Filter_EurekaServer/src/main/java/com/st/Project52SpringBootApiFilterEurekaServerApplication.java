package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Project52SpringBootApiFilterEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project52SpringBootApiFilterEurekaServerApplication.class, args);
	}

}
