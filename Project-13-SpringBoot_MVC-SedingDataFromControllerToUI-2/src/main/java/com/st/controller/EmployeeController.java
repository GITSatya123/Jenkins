package com.st.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.st.model.Employee;
import com.st.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/show")
	public String showData(Model model) {
		List<Employee> list=service.getEmployee();
		model.addAttribute("list", list);
		return "empData";
	}
}
