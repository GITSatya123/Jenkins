package com.st.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.model.Employee;
import com.st.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	@Override
	public Integer saveEmp(Employee emp) {
		
		return repo.save(emp).getEmpNo();
	}

	@Override
	public void updateEmp(Employee emp) {
		repo.save(emp);
		
	}

	@Override
	public void deleteEmp(Integer empNo) {
		repo.deleteById(empNo);
		
	}

	@Override
	public Optional<Employee> getOneEmp(Integer empNo) {
		return repo.findById(empNo);
		
	}

	@Override
	public List<Employee> getAllEmp() {
		
		return repo.findAll();
	}

	@Override
	public boolean isEmpExist(Integer empNo) {
	
		return repo.existsById(empNo);
	}

}
