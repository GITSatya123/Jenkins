package com.st;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.st.app.Product;

@SpringBootApplication
public class SpringBootBannerChangeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBannerChangeApplication.class, args);
	}
	
	//Runner Class
	@Autowired
	private Product pinfo;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Test From Runner:"+pinfo);
		
	}
	//AppConfig class 
	@Bean
	public Product probObj() {
		Product p= new Product();
		p.setPid(109);
		p.setPname("Almond");
		return p;
	}
}
