package com.st.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.st.model.Student;

public interface StudentRepositoy extends MongoRepository<Student, Integer> {

}
