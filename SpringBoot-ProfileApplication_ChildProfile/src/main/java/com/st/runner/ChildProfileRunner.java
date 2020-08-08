package com.st.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.ToString;


@ToString
@Component
public class ChildProfileRunner implements CommandLineRunner{
	
	@Value("${app.common}")
	private String common;
	@Value("${app.name}")
	private String name;
	@Value("${app.version}")
	private float version;
	
	@Value("${db.name}")
	private String dbName;
	@Value("${db.url}")
	private String dburl;
	@Value("${db.user}")
	private String user;
	@Value("${db.pwd}")
	private String pwd;
	
	@Value("${mail.host}")
	private String mailhost;
	@Value("${mail.port}")
	private int port;

	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}

}
