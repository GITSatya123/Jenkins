package com.st.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.st.model.Student;

@Controller
public class StudentController {

	@RequestMapping("/show")
	public String showData() {
		return "data";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String readData(@ModelAttribute("student")Student std,Model model) {	
		
		model.addAttribute("sData", std);
		return "sSuccess";
	}
}
