package com.st.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@ConfigurationProperties("my.db")
@ToString
@Setter
@Getter
public class ProfileDataRunner implements CommandLineRunner {
	
	
	private Integer id;
	
	private String name;
	
	private double version;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(id);
		System.out.println(name);
		System.out.println(version);

	}

}
