package com.st.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.st.product.ProductInfo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
@ToString
@ConfigurationProperties("my.product")
public class BeanReaderRunner implements CommandLineRunner{
	
	
	private ProductInfo pinfo; 
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
		
	}

}
