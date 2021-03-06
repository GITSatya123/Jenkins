package com.st.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.consumer.BrandRestConsumer;
import com.st.model.Brand;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	private BrandRestConsumer consumer;
	
	@GetMapping("/data")
	public String getProduct() {
		return "From Product"+consumer;
			}
	
	@GetMapping("/one")
	public String getObject() {
		return "From Product:"+consumer.getObject();
	}
	
	@GetMapping("/all")
	public String getMultiple(){
		return "From Product:"+consumer.getAllBrandList();
	}
	
	@PostMapping("/printmsg")
	public String getPrintMgs() {
		return "From Product:"+consumer.printCode();
	}
	
	@PostMapping("/saveobj")
	public String getSaveMsg(@RequestBody Brand brand) {
		return "From product:"+consumer.saveBrand(brand);
	}
}
