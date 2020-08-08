package com.st.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
