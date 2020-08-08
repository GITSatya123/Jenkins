package com.st.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.model.Student;
import com.st.repo.StudentRepositoy;

@Component
public class StudentRunner implements CommandLineRunner{

	@Autowired
	private	StudentRepositoy repo;
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(repo.getClass().getName());
		
		Student s=repo.save(new Student(101, "satya", "male"));
		repo.save(new Student(102, "jeet", "male"));
		repo.save(new Student(103, "chintu", "male"));
		System.out.println(s);
		
		repo.findAll().forEach(System.out::println);
	}

	
}
