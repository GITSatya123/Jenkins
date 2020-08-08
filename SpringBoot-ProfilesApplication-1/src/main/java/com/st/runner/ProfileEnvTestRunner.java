package com.st.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProfileEnvTestRunner implements CommandLineRunner {

		@Value("${my.db.name}")
		private String dbname;
		@Value("${my.db.url}")
		private String url;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Database is:"+dbname+"..."+url);
		
	}

}
