package com.st.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeRestController {

	@GetMapping("/show")
	public ResponseEntity<String> showPage(){
		String body="First Application";
		ResponseEntity<String> resp=new ResponseEntity<String>(body, HttpStatus.OK);
		return resp;
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(){
		return new ResponseEntity<String>("FORM SAVE",HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(){
		return new ResponseEntity<String> ("From Update",HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteStudent(){
		return new ResponseEntity<String> ("FROM DELETE",HttpStatus.OK);
	}
	@GetMapping("/all")
	public ResponseEntity<String> getAllStudent(){
		return new ResponseEntity<String>("From Fetch",HttpStatus.OK);
	}
	
	
}