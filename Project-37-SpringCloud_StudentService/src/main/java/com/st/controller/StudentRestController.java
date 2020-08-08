package com.st.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.consumer.CourseRestConsumer;

@RestController
@RequestMapping("/std")
public class StudentRestController {

	@Autowired
	private CourseRestConsumer consumer;
	
	@GetMapping("/cdetails")
	public String getDetails() {
		String bm= consumer.communicateWithCourse();
		return "FROM-STUDENT"+bm;
	}
}
