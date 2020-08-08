package com.st.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.model.VendorTime;
import com.st.repo.VendorTimeRepo;

@Component
public class VendorRunner implements CommandLineRunner {

	@Autowired
	private VendorTimeRepo repo;
	@Override
	public void run(String... args) throws Exception {
		
		Date d= new Date();
		repo.save(new VendorTime(101, "satya", d, d, d));
		repo.save(new VendorTime(102, "jeet", d, d, d));
		repo.save(new VendorTime(103, "joet", d, d, d));
		System.out.println("Record Inserted");

	}

}
