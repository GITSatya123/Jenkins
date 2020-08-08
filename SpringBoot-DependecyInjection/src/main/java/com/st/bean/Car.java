package com.st.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private IEngine eng;

	/*@Autowired
	public void setEng(IEngine eng) {
		this.eng = eng;
	}*/
	@Autowired 
	public Car(IEngine eng) {
		super();
		this.eng = eng;
	}
	
	public void drive() {
	
	int	status=eng.start();
		if(status==0) {
			System.out.println("Journey started");	
		}
		
	}

	
}
