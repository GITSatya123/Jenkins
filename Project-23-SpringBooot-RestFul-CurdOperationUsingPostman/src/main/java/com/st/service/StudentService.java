package com.st.service;

import java.util.List;
import java.util.Optional;

import com.st.model.Student;

public interface StudentService {

	public Integer saveStdData(Student s);
	public  void updateStdData(Student s);
	public void deletestdData(Integer id);
	public Optional<Student> getOneStdData(Integer id);
	public List<Student> getAllStdData();
	public boolean isExistStdData(Integer id);
}
