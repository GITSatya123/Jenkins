package com.st.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.st.exeption.CompanyNotFoundException;

@ControllerAdvice
public class CompanyExceptionHandler {

	@ExceptionHandler(value=CompanyNotFoundException.class)
	public ResponseEntity<String> handleCompanyNotFoundException(){
		return new ResponseEntity<String>("Company not Found", HttpStatus.BAD_REQUEST);
	}
}
