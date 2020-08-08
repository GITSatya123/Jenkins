package com.st.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	/*@GetMapping("/show")
	public String showData(@RequestParam(value="empId",defaultValue ="700") 
									Integer empId, @RequestParam String eName) {
		
		return "Data is:"+empId+"===="+eName;
	}
	
	@GetMapping("/info/{sid}/{sname}")
	public String showInfo(@PathVariable Integer sid, @PathVariable String sname) {
		
		return "Data is:"+sid+"..."+sname;
	}*/
	
	@PostMapping("/show/{empId}")
	public String showData(@PathVariable Integer empId,@RequestParam String eName ) {
		
		return "Data is:"+empId+"===="+eName;
	}
	
}
