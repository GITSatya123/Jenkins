package com.st.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.client.StockPriceClient;
import com.st.exp.CompanyNotFoundException;

@RestController
@RequestMapping("/cal")
public class StockCalculationRestController {

	@Autowired
	private StockPriceClient client;
	
	@GetMapping(value="/calculate/{companyName}/{quantity}")
	public ResponseEntity<String> claculate(@PathVariable("companyName") String companyName
											,@PathVariable("quantity") Integer quantity) {
		
		Double totalPrice=null;
		ResponseEntity<Double> restEntity=client.getStockPrice(companyName);
		Integer statusCode =restEntity.getStatusCode().value();
		
		if(statusCode==200) {
			Double companyStockPrice=restEntity.getBody();
			totalPrice=quantity* companyStockPrice;
		
		String response="TotalPrice:"+totalPrice;
		
		
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
		else {
			return new ResponseEntity<String>("company not found",HttpStatus.BAD_REQUEST);
		}
		
		
}
	}

