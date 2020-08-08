package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Project39SpringCloudLbcEmployeeServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project39SpringCloudLbcEmployeeServiceConsumerApplication.class, args);
	}

}
