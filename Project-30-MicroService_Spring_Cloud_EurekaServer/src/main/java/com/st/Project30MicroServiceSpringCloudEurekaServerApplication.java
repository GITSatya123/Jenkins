package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Project30MicroServiceSpringCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project30MicroServiceSpringCloudEurekaServerApplication.class, args);
	}

}
