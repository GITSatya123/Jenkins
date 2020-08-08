package com.st.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.consumer.AddressRestConsumer;

@RestController
@RequestMapping("/emp")
public class EmoloyeeRestController {
	
	@Autowired
	private AddressRestConsumer consumer;

	@GetMapping("/info")
	public String getInfo() {
		return "FROM-EMP-SERVICE"+consumer.getAddrsData();
	}
}
