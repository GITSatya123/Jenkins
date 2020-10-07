package com.st.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.st.exeption.CompanyNotFoundException;

@Service
public class StockUIService {

	public String getTotalStockPrice(String companyName,Integer quantity) {
		String REST_ENDPOINT ="http://localhost:1113/calculate/{companyName}/{quantity}";
		
		WebClient wc=WebClient.create();
		String response=wc.get().uri(REST_ENDPOINT, companyName,quantity)
		.retrieve()
		.bodyToMono(String.class)
		.block();
		
		/*
		 * if(companyName ) { throw new CompanyNotFoundException("company not found"); }
		 */
		return response;
		
	}
}
