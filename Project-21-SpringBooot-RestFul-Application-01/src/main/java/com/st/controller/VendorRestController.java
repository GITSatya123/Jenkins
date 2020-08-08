package com.st.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.st.model.Vendor;

@RestController
public class VendorRestController {

	/*@GetMapping("/v")
	public Vendor getVendor() {
		return new Vendor(101, "Jeet", "furniture",
						List.of("M1","M2","M3"), 
						new String[] {"IN1","IN2","IN3"},
						Map.of("S1","V1","S2","V2","S3","V3"),
						new Address("Ameerpet", "Telengana", "India", 500038));
	}*/
	
	@PostMapping(path="/data")
	public String showData(
			//@RequestBody className objectName
			@RequestBody Vendor vendor) 
	{
		return "Hello=>"+vendor.toString();
	}
}
