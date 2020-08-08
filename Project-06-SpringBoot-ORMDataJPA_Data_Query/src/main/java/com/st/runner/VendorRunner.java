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
		
		
		/*repo.save(new VendorInfo(101, "pravat", "male", 25));
		repo.save(new VendorInfo(102, "chintu", "male", 29));
		repo.save(new VendorInfo(103, "sipu", "male", 20));
		repo.save(new VendorInfo(104, "saina", "female", 12));
		
		System.out.println("Record Inserted");*/
		
		/*repo.getVenData("pravat").forEach(System.out::println);
		System.out.println("============================");
		repo.getVenNativeData("chintu").forEach(System.out::println);
		System.out.println("============================");
		repo.getVData("male").forEach(System.out::println);*/
		//int count=repo.modifyName("swajit", 102);
		//System.out.println(count);
		int count=repo.removeBy(25);
		System.out.println(count);
	}

}
