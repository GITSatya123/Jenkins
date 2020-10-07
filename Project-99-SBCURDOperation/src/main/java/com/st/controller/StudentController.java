package com.st.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.st.model.Student;
import com.st.service.StudentService;

@Controller
@RequestMapping("/std")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/show")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "studentregister";
	}
	
	
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute Student student, Model model) {
		Integer id= service.saveStudent(student);
		String message="Student data"+id+"is saved!";
		model.addAttribute("message", message);
		model.addAttribute("student",new Student());
		return "studentregister";
	}
	
	/*@GetMapping("/all")
	public String getAllStudent(Model model) {
		List<Student> list =service.getAllStudent();
		model.addAttribute("list", list);
		return "studentdata";
	}*/
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam Integer id) {
		if(service.isStudentExists(id)) {
		service.deleteStudent(id);
		}
	return "redirect:all";
	}
	
	@GetMapping("/edit")
	public String editStudent(@RequestParam Integer id,Model model) {
		Optional<Student> opt=service.getOneStudent(id);
		if(opt.isPresent()) {
			model.addAttribute("student", opt.get());
		}
		return "studentedit";
	}
	
	@PostMapping("/update")
	public String updateStudent(@ModelAttribute Student student,Model model) {
		 service.updateStudent(student);
		return "redirect:all";
	}
	
	@GetMapping("/all")
	public String fetchAll(@PageableDefault (page=0,size=3)Pageable p,Model model) {
		Page<Student> page=service.getStudentPage(p);
		model.addAttribute("page", page);
		return "studentdata";
	}
}
