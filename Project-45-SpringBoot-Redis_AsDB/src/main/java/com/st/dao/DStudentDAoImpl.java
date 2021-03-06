package com.st.dao;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import com.st.model.Student;

@Repository
public class DStudentDAoImpl implements StudentDAO{

	private final String KEY= "STUDENT";
	@Resource(name="rt")
	private HashOperations<String, Integer, Student> opr;
	@Override
	public void addStudent(Student s) {
		opr.putIfAbsent(KEY, s.getStdId(), s);
		
	}

	@Override
	public void modifyStudent(Student s) {
		opr.put(KEY, s.getStdId(), s);
		
	}

	@Override
	public Student getOneStudent(Integer id) {
		opr.get(KEY, id);
		return null;
	}

	@Override
	public Map<Integer,Student> getAllStudent() {
		
		return opr.entries(KEY);
	}

	@Override
	public void deleteStudent(Integer id) {
		opr.delete(KEY, id);
		
	}

}
