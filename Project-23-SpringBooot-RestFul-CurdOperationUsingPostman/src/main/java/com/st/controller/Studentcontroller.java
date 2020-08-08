package com.st.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.model.Student;
import com.st.service.StudentService;

@RestController
@RequestMapping("/rest/s")
//@CrossOrigin(origins = "http://localhost:4200")
public class Studentcontroller {

	@Autowired
	private StudentService service;

	//1.save one StudentData
	@PostMapping("/save")
	public ResponseEntity<String> saveOneStdData(@RequestBody Student s ){
		ResponseEntity<String> resp=null;
		try {
			//if studentData exists	
			if(s.getId()!=null && service.isExistStdData(s.getId())) {
				resp=new ResponseEntity<String>("Given sid '"+s.getId()+"' already exists",HttpStatus.BAD_REQUEST);
			}else {
				Integer id=service.saveStdData(s);
				resp=new ResponseEntity<String>("Student data'"+id+"'saved Successfully",HttpStatus.OK);
			}

		}catch(Exception e) {
			resp=new ResponseEntity<String>("unable to save StudentData",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	//2.Get one student by Id
	
	@GetMapping("/one/{id}")
	public ResponseEntity<?>getOneStd(@PathVariable Integer id){
		ResponseEntity<?> resp=null;
		try {
			Optional<Student> opt=service.getOneStdData(id);
			if(opt.isPresent()) {//if student Id exists
				Student s= opt.get();
				resp=new ResponseEntity<Student>(s,HttpStatus.OK);
			}else {//if student id not exists
				resp=new ResponseEntity<String>("StudentID '"+id+"'not Exists",HttpStatus.BAD_REQUEST);
			}
		}catch(Exception e) {
			resp=new ResponseEntity<String>("Unable to fetch StudentData",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	// 3.Get All Student
	@GetMapping("/all")
	public ResponseEntity<?> getAllStd(){
		ResponseEntity<?> resp=null;
		
		try {
			List<Student> list=service.getAllStdData();
			resp=new ResponseEntity<List<Student>>(list,HttpStatus.OK);
		}catch(Exception e) {
			resp=new ResponseEntity<String>("Unable to Fetch",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	//4.update StudentData
	@PutMapping("/update")
	public ResponseEntity<String> updateStd(@RequestBody Student s){
		ResponseEntity<String> resp=null;
		try {
			if(s.getId()!=null && service.isExistStdData(s.getId())) {
			service.updateStdData(s);
			resp=new ResponseEntity<String>("Student data '"+s.getId()+"'is updated",HttpStatus.OK);
			}
			else {
				resp=new ResponseEntity<String>("StudentData'"+s.getId()+"'Not exists",HttpStatus.BAD_REQUEST);
			}
		}catch(Exception e) {
			resp=new ResponseEntity<String>("Unable to update",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	//5.delete std data
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStdData(@PathVariable Integer id){
		ResponseEntity<String> resp=null;
		
		try {
			if(service.isExistStdData(id)) {
				service.deletestdData(id);
				resp=new ResponseEntity<String>("StudentId'"+id+"' is deleted",HttpStatus.OK);
			}else {
				resp=new ResponseEntity<String>("StudentId'"+id+"' is mot exist",HttpStatus.BAD_REQUEST);
			}
			
		}catch(Exception e) {
			resp=new ResponseEntity<String>("Unable to update",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
		
	
	
	
}
