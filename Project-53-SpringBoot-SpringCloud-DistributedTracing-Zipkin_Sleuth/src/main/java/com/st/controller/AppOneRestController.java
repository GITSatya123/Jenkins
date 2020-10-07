package com.st.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppOneRestController {

	private Logger log=LoggerFactory.getLogger(AppOneRestController.class);
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/showA")
	public String showA() {
		log.info("WelCome to MService-1");
		rt.getForObject("http://localhost:9999/showB", String.class);
		log.info("Back to Service-1");
		return "DONE";
	}

}
