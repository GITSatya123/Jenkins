package com.st.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/product")
public class ProductRestController {

	@GetMapping("/show")
	public String showData() {
		return "Satyajit";
	}
}
