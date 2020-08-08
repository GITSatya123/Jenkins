package com.st.run;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InputDataRunner implements CommandLineRunner{
	
	@Value("${my.app.id}")
	private int LaptopId;
	@Value("${my.app.name}")
	private String LaptopName;
	@Value("${my.app.version}")
	private double ram;
	@Value("${my.app.cost}")
	private long price;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "InputDataRunner [LaptopId=" + LaptopId + ", LaptopName=" + LaptopName + ", ram=" + ram + ", price="
				+ price + "]";
	}

	
}
