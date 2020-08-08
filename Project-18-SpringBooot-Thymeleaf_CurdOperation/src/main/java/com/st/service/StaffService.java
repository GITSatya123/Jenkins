package com.st.service;

import java.util.List;
import java.util.Optional;

import com.st.model.Staff;

public interface StaffService {

	public Integer saveStaff(Staff s);
	public void updateStaff(Staff s);
	public void deleteStaff(Integer id);
	public Optional<Staff> getOneStaff(Integer id);
	public List<Staff> getAllStaff(); 
}
