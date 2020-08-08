package com.st.consumer;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.st.model.Brand;


@FeignClient(name="BRAND-SERVICE")
public interface BrandRestConsumer {

	@GetMapping("/brand/msg/{code}")
	public String getBrand(@PathVariable("code") String code); 
	
	@GetMapping("/brand/obj")
	public Brand getObject(); 
	
	@GetMapping("/brand/list")
	public List<Brand> getAllBrandList();

	@PostMapping("/brand/code")
	public ResponseEntity<String> printCode();
	
	@PostMapping("/brand/save")
	public ResponseEntity<String> saveBrand(@RequestBody Brand brand);
}
