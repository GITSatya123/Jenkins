package com.st.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.st.model.VendorInfo;

public interface VendorRepo extends JpaRepository<VendorInfo, Integer>{

//working with collection
	
	
}
