package com.st.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.st.model.Student;
import com.st.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public Integer saveStudent(Student s) {
		return repo.save(s).getStdId();
		
	}

	@Override
	public void updateStudent(Student s) {
		repo.save(s);

	}

	@Override
	public void deleteStudent(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public Optional<Student> getOneStudent(Integer id) {
		
		return repo.findById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return repo.findAll();
	}

	@Override
	public boolean isStudentExists(Integer id) {
		
		return repo.existsById(id);
	}

	@Override
	public Page<Student> getStudentPage(Pageable p) {
		
		return repo.findAll(p);
	}

	@Override
	public Integer countofStdName(String stdName) {
		return repo.countstdofName(stdName);
		
	}

	
		
	

}
