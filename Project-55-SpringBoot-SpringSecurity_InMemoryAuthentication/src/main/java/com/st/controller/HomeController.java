package com.st.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/welcome")
	public String showAll() {
		return "welcomePage";
	}
	
	@GetMapping("/student")
	public String showStudent() {
		return "studentPage";
	}
	
	@GetMapping("/emp")
	public String showEmp() {
		return "empPage";
	}
	
	@GetMapping("/common")
	public String showCommon() {
		return "commonPage";
	}
	
	@GetMapping("/denied")
	public String showDenied() {
		return "deniedPage";
	}
}
