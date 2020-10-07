package com.st.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentRestController {

	@GetMapping("/pay")
	public String doPayment() {
		return "FROM-PAYMENT";
	}
}
