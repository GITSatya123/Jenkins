package com.st.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AppConfig {

	
	  @Bean public Product probObj() { 
		  Product p= new Product();
		  p.setPid(109);
	  p.setPname("Almond"); 
	  return p; 
	  }
	 
}
