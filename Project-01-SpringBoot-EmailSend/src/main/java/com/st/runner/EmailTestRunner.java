package com.st.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.st.service.NITMailService;

@Component
public class EmailTestRunner implements CommandLineRunner{

	@Autowired
	private NITMailService service;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		FileSystemResource file= new FileSystemResource("C:\\Users\\SATYAJIT\\Desktop\\satya.jpg");
		boolean sent=service.sendEmail("beherasatyajit50@gmail.com", 
							new String[] {"iamsatyajit50@gmail.com"},new String [] {"swagatika764@gmail.com"},
							"welcome to SoftwareWorld","JaVa Developer",file);
									
				if(sent) {
					System.out.println("Email sent");
				}else {
					System.out.println("Sending failed");
				}
		
	}

}
