package com.st.exeption;

public class CompanyNotFoundException extends RuntimeException{

	public CompanyNotFoundException(String msg) {
		super(msg);
	}
}
