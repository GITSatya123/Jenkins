package com.st.service;

import java.util.List;
import java.util.Optional;

import com.st.model.Employee;

public interface EmployeeService {

	public Integer saveEmp(Employee emp);
	public void updateEmp(Employee emp);
	public void deleteEmp(Integer empNo);
	public Optional<Employee> getOneEmp(Integer empNo);
	public List<Employee> getAllEmp();
	public boolean isEmpExist(Integer empNo);
}
