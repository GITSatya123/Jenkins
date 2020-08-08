package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.st.bean.Car;

@SpringBootApplication
public class SpringBootDependecyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootDependecyInjectionApplication.class, args);
		Car car=ctx.getBean(Car.class);
		car.drive();
	}

}
