package com.st.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.model.Contract;
import com.st.model.Vendor;
import com.st.repo.ContractRepo;
import com.st.repo.VendorRepo;

@Component
public class VendorRunner implements CommandLineRunner {

	@Autowired
	private VendorRepo vrepo;
	@Autowired
	private ContractRepo crepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Contract c1=new Contract(50, "FullTime", 6000.89);
		crepo.save(c1);
		Contract c2= new Contract(60, "PartTime", 20884.56);
		crepo.save(c2);
		
		Vendor v= new Vendor();
		v.setVId(101);
		v.setVName("satya");
		v.setCob(Arrays.asList(c1,c2));
		
		vrepo.save(v);
		System.out.println("Data Inserted");
		
		List<Object[]> list=vrepo.getData(101);
		for(Object[] ob:list) {
			System.out.println(ob[0]+"..."+ob[1]+"...."+ob[2]);
		}
	}

}
