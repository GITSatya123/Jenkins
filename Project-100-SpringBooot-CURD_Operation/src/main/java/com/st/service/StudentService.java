package com.st.service;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.st.model.Student;

public interface StudentService {

	public Integer saveStudent(Student s);
	public void updateStudent(Student s);
	public void deleteStudent(Integer id);
	public Optional<Student> getOneStudent(Integer id);
	public List<Student> getAllStudent();
	public boolean isStudentExists(Integer id);
	
	public Page<Student> getStudentPage(Pageable p);
	Integer countofStdName(String stdName);
}
