package com.st.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome/{name}")
	public String generateWishMessage(@PathVariable("name") String name) {
		String message=name+"Welcome to RestAPI";
		return message;
	}
}
