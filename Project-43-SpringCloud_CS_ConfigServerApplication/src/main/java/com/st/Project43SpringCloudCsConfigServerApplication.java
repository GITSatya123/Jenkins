package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Project43SpringCloudCsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project43SpringCloudCsConfigServerApplication.class, args);
	}

}
