package com.st.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowhomeController {

	@RequestMapping("/welcome.htm")
	public String showHome() {
		return "home";
	}
}
