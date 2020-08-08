package com.st.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.emp.Employee;

@Component
public class LombokTestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		//Employee e1= new Employee(101, "satya", 70000);
		//System.out.println(e1);
		
		Employee e2=new Employee();
		e2.setEmpno(60);
		e2.setEname("lipi");
		e2.setSal(50000);
		System.out.println(e2);
		
	}

	
}
