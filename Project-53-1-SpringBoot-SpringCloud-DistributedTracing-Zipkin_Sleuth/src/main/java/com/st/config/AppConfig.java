package com.st.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@Configuration
public class AppConfig {

	@Bean
	public RestTemplate rt() {
		return new RestTemplate();
	}
	
	public Sampler samplerObj() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
}
