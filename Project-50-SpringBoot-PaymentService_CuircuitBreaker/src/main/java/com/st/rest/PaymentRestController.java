package com.st.rest;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class PaymentRestController {

	@GetMapping("/pay")
	@HystrixCommand(fallbackMethod = "doPaymentFallBack")
	public String doPayment() {
		System.out.println("FORM ACTUAL SERVICE");
		if(new Random().nextInt(10)<15) {
			throw new RuntimeException("Dummy ERROR");
		}
		return "SUCCESS";
	}
	
	public String doPaymentFallBack() {
		System.out.println("FROM FALL BACJK METHOD");
		return "FAIL-TRY-LATER";
	}
}
