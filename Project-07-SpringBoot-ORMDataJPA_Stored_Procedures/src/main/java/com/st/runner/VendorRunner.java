package com.st.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.st.model.VendorInfo;
import com.st.repo.VendorRepo;
//import com.st.repo.StaffRepo.DatailsA;
//import com.st.repo.StaffRepo.DatailsB;
//import com.st.repo.StaffRepo.MyViewA;
//import com.st.repo.StaffRepo.MyViewB;

@Component
public class VendorRunner implements CommandLineRunner{
	
	@Autowired
	private VendorRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		//repo.save(new VendorInfo(110, "google", "male", 56, "SV-9"));
		//repo.save(new VendorInfo(111, "Mozola", "FEmale", 67, "SVH-90"));
		//repo.save(new VendorInfo(112, "Crome", "male", 57, "SVH-96"));
		
		System.out.println("data updated");
	}

}
