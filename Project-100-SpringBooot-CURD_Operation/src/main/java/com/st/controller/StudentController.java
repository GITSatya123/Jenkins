package com.st.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.st.model.Student;
import com.st.service.StudentService;
import com.st.validator.StudentValidator;

@Controller
@RequestMapping("/student")
public class StudentController {

	
	@Autowired
	private StudentValidator validator;
	
	@Autowired
	private StudentService service;

	//1. show reg page
	@GetMapping("/reg")
	public String showReg(Model model) {
		model.addAttribute("student", new Student());
		return "studentRegister";
	}
	
	//2.save Student Data
	@PostMapping("/save")
	public String save(@ModelAttribute Student student , Errors errors,Model model) {
	//call validate method
		validator.validate(student, errors);
		if(!errors.hasErrors()) {
		Integer id=service.saveStudent(student);
		model.addAttribute("message", "Student'"+id+"'saved!");
		//From Backing object
		model.addAttribute("student", new Student());
		}else {
			model.addAttribute("message", "Please check all Errors");
		}
		return "studentRegister";
				
	}
	//3.Fetch Data to UI
	/* @GetMapping("/all")
	public String fetchAllData(Model model) {
		List<Student> list=service.getAllStudent();
		model.addAttribute("list", list);
		return "StudentData";
	}*/
	
	//4.delete data
	
	@GetMapping("/delete")
	public String deleteData(@RequestParam Integer id) {
		if(service.isStudentExists(id)) {
			service.deleteStudent(id);
		}
		return "redirect:all";
	}
	
	//5.Edit Data
	@GetMapping("/edit")
	public String editData(@RequestParam Integer id, Model model) {
		model.addAttribute("student", service.getOneStudent(id));
		return "studentEdit";
	}
	
	//6.Update data
	@PostMapping("/update")
	public String updateData(@ModelAttribute Student student,Model model) {
		 service.updateStudent(student);
		 return "redirect:all";
	}
	
	//7.pagination
	
	@GetMapping("/all")
	public String fetchAll(@PageableDefault(page=0,size=5)Pageable p,Model model) {
		Page< Student> page=service.getStudentPage(p);
		model.addAttribute("page", page);
		return"StudentData";
	}
	
	@RequestMapping("/checkName")
	public @ResponseBody String validateName(
		@RequestParam String stdName
		) 
	{
	  String msg="";
	  int count=service.countofStdName(stdName);
	  if(count>0) {
		msg=stdName + " Already Exist";
	  }
	  return msg;
	}

}
