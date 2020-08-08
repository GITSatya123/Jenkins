package com.st.run;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class InputDataRunner implements CommandLineRunner {

	@Value("${my.laptop.id}")
	private int LaptopId;
	@Value("${my.laptop.name}")
	private String Name;
	@Value("${my.laptop.ram}")
	private double ram;
	@Value("${my.laptop.cost}")
	private long cost;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}

	@Override
	public String toString() {
		return "InputDataRunner [LaptopId=" + LaptopId + ", Name=" + Name + ", ram=" + ram + ", cost=" + cost + "]";
	}
	
	

}
