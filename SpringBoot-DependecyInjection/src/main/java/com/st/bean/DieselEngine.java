package com.st.bean;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("0-param:DieselEngine:Constructor");
	}
	
	
	@Override
	public int start() {
		System.out.println("DieselEngine Started");
		return 0;

	}

}
