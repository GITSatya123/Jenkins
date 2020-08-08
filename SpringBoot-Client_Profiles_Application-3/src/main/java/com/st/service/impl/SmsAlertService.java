package com.st.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.st.service.AlertService;

@Component
@Profile("prod-nit")
public class SmsAlertService implements AlertService{

	
	@Value("${app.code}")
	private  String code;
	@Override
	public void showMsg() {
		System.out.println("Form SMS-Alert service-->"+code);
	}

}
