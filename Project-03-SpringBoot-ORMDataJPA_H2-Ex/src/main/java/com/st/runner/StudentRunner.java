package com.st.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.entity.Student;
import com.st.repo.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner{
		
		@Autowired
		private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Student(101, "satya", 20000.56));
		repo.save(new Student(102, "sisir", 47382.34));
		repo.save(new Student(103, "sachin", 7478));
		repo.save(new Student(104, "sai", 78999));
		repo.save(new Student(105, "raj", 33445.66));
		
		repo.delete(new Student(105, "raj", 33445.66));
		
		System.out.println("Data Inserted Successfully ");
	}

}
