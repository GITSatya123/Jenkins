package com.st.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.model.Vendor;
import com.st.repo.VendorRepo;
@Component
public class VendorRunner implements CommandLineRunner{
	
	@Autowired
	private VendorRepo repo;
	@Override
	public void run(String... args) throws Exception {
		//save(obj)
		/*repo.save(new Vendor(101, "satya", "hyd", 25));
		repo.save(new Vendor(102, "sachin", "bbsr", 29));
		repo.save(new Vendor(103, "sisir", "kolkata", 77));
		repo.save(new Vendor(104, "anuu", "hyd", 45));
		repo.save(new Vendor(105, "raj", "odisha", 46));
		repo.save(new Vendor(105, "suraj", "london", 48));*/
		/*
		 * repo.saveAll(Arrays.asList(new Vendor(106, "ankit", "japan", 47), new
		 * Vendor(108, "braja", "china", 67), new Vendor(107, "lipy", "mmalesiya",
		 * 47)));
		 */
		
		
		//delete data
		//repo.deleteById(105);
		//repo.deleteAll();
		
		//find All row
		//repo.findAllById(Arrays.asList(101,105,107,103)).forEach(System.out::println);
		List<Vendor> list=repo.findAll();
		//Method reference
		list.forEach(System.out::println);
		/*System.out.println("---------------");
		System.out.println("Data Inserted");
		
		//using Lambda Expression
		list.forEach(v->System.out.println(v));
		System.out.println("-------------------");
		//using collection
		for(Vendor v:list) {
			System.out.println(v);
		}*/
		
		//find byId
		//java 9 version
		/*Optional<Vendor> opt=repo.findById(106);
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}*/
		//method reference
		//Optional<Vendor> opt=repo.findById(101);
		//opt.ifPresent(System.out::println);
		
		
		}

}
