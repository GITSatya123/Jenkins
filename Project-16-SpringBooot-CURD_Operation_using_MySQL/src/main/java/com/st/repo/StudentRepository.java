package com.st.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.st.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Query("select count(stdName) from Student where stdname=:stdName")
	Integer countstdofName(String stdName);
}
