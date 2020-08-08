package com.st.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.model.Student;
import com.st.repo.StudentRepo;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private StudentRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
	List<Integer>list=new ArrayList<>();
		repo.save(new Student(111, "ohs", List.of(), "set", "Map"));
		
		 
	}

}
