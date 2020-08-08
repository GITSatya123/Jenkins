package com.st.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.st.model.Employee;
import com.st.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	//1.show registration page
	@GetMapping("/")
	public String showPage(Model model ) {
		model.addAttribute("emp", new Employee());
		return "empReg";
	}
	
	//2.save Emp
	@PostMapping("/save")	
	public String saveEmp(@ModelAttribute Employee emp,Model model) {
		Integer empNo=service.saveEmp(emp);
		model.addAttribute("message","Employee'"+empNo+"' saved!");
		model.addAttribute("emp", new Employee());
		return "empReg";
	}
	@GetMapping("/all")
	public String fetchAll(Model model) {
		List<Employee> list=service.getAllEmp();
		model.addAttribute("list", list);
		return "empData";
	}
}
