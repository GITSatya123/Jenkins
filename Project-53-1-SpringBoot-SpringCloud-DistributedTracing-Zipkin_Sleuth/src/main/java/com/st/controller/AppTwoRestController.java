package com.st.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppTwoRestController {

	Logger log=LoggerFactory.getLogger(AppTwoRestController.class);
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/showB")
	public String showB() {
		log.info("WElcome to MS-2");
		log.info("Bye From Ms-2");
		
		return "From MS-2";
	}
}

