package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Project38SpringCloudLbcAddressServiceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project38SpringCloudLbcAddressServiceProducerApplication.class, args);
	}

}
