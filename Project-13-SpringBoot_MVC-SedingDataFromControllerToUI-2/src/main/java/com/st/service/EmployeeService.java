package com.st.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.st.model.Employee;

@Service
public class EmployeeService {

	public List<Employee> getEmployee(){
		List<Employee> emp= new ArrayList<>();
		emp.add(new Employee(101, "satya", 27838.45));
		return emp;
	}
}
