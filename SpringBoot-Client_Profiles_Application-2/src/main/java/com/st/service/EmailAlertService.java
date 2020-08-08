package com.st.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class EmailAlertService implements AlertService{

	@Override
	public void showMsg() {
		System.out.println("Form Default-Email service");
	}

}
