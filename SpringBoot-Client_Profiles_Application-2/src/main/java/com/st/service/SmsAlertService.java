package com.st.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("nit")
public class SmsAlertService implements AlertService{

	@Override
	public void showMsg() {
		System.out.println("Form SMS-Alert service");
	}

}
