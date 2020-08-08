package com.st.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.model.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Integer>{

}
