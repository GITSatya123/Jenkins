package com.st.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("htc")
public class SocialAlertService implements AlertService{

	@Override
	public void showMsg() {
		System.out.println("Form Social-Alert service");
	}

}
