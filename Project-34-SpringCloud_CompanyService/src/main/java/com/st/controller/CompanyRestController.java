package com.st.controller;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.consumer.BranchRestConsumer;

@RestController
@RequestMapping("/company")
public class CompanyRestController {

	@Autowired
	private BranchRestConsumer consumer;
	
	@GetMapping("/data")
	public String getMsg() {
		String bm=consumer.communicateWithBranch();
		return "Form-Company=>"+bm;
	}
}
