package com.st.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.st.service.AlertService;

@Component
@Profile("default")
public class EmailAlertService implements AlertService{
	
	@Value("${app.code}")
	private  String code;
	@Override
	public void showMsg() {
		System.out.println("Form Default-Email service--->"+code);
	}

}
