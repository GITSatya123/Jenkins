package com.st.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
