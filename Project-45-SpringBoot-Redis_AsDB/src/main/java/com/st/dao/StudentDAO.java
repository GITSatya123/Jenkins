package com.st.dao;

import java.util.Map;

import com.st.model.Student;

public interface StudentDAO {

	public void addStudent(Student s);
	public void modifyStudent(Student s);
	public Student getOneStudent(Integer id);
	public Map<Integer, Student> getAllStudent();
	public void deleteStudent(Integer id);
}
