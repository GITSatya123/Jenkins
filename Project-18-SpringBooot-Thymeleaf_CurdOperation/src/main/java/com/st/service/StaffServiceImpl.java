package com.st.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.model.Staff;
import com.st.repo.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffRepository repo;
	
	@Override
	public Integer saveStaff(Staff s) {
		return repo.save(s).getStaffId();
	}

	@Override
	public void updateStaff(Staff s) {
		repo.save(s);

	}

	@Override
	public void deleteStaff(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public Optional<Staff> getOneStaff(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<Staff> getAllStaff() {
		
		return repo.findAll();
	}

}
