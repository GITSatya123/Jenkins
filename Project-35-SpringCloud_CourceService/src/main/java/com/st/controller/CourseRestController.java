package com.st.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseRestController {

	@GetMapping("/details")
	public String courseDetails() {
		
		return "COURSE-DETAILS";
	}
}
