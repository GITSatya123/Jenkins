package com.st.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.model.Student;

@RestController
public class StudentController {

	@GetMapping("/a")
	public String showA() {
		return "WELCOME";
	}
	
	@GetMapping("/b")
	public Student showB() {
		return new Student(101,"satya",3000);
	}
	
	@GetMapping("/c")
	public List<Student> showC() {
		return Arrays.asList(new Student(102, "raj", 4444),
							 new Student(103, "saina", 5564),
							 new Student(104, "raaaj", 4554));
	}
	
	@GetMapping("/d")
	public Map<String ,	Student> showD(){
		return Map.of("s1", new Student(105, "love", 7838),
					  "s2", new Student(106, "hate", 2538),
					  "s3", new Student(107, "both", 7568));
				
					
	}
}
