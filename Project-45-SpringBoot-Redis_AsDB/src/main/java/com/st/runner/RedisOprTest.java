package com.st.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.dao.StudentDAO;
import com.st.model.Student;

@Component
public class RedisOprTest implements CommandLineRunner {

	@Autowired
	private StudentDAO dao;
	@Override
	public void run(String... args) throws Exception {
		dao.addStudent(new Student(101, "SATYA", "MALE", 9000.90));
		dao.addStudent(new Student(102, "SANU", "MALE", 9055.90));
		dao.addStudent(new Student(103, "MAMAN", "FEMALE", 780.90));
		dao.addStudent(new Student(104, "ANUU", "MALE", 9054.90));

		dao.getAllStudent().forEach((k,v)->System.out.println(k+"....."+v));
		dao.deleteStudent(102);
		dao.modifyStudent(new Student(104, "ANANYA", "FEMALE", 5566.78));
		
		dao.getAllStudent().forEach((k,v)->System.out.println(k+"======"+v));
		System.out.println();
		dao.modifyStudent(new Student(101, "satyajeet"," male", 4444.6));
		dao.getAllStudent().forEach((k,v)->System.out.println(k+"....."+v));
	}

}
