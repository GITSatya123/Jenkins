package com.st;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.st.rest.WelcomeRestController;

@SpringBootTest
class Project58RestUnitTestAppApplicationTests {

	@Autowired
	private WelcomeRestController wrc;
	@Test
	void contextLoads() {
		System.out.println("**** ContextLoads Called****");
		assertThat(wrc).isNotNull();
	}

}
