package com.st.cotroller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.model.Brand;

@RestController
@RequestMapping("/brand")
public class BrandRestController {

	@GetMapping("/msg/{code}")
	public String getBrand(@PathVariable("code") String code) {
		return "From-Brand-Service"+code;
	}
	
	@GetMapping("/obj")
	public Brand getObject() {
		return new Brand(101, "BSR12", "satya", "Awesom");
	}
	
	@GetMapping("/list")
	public List<Brand> getAllBrandList(){
		return List.of(new Brand(102, "BXR52", "liku", "nice"),
					  new Brand(103, "BSUY5", "snuu", "good"),
					  new Brand(104, "BSGH5", "maan", "super"));
	}
	
	@PostMapping("/code")
	public ResponseEntity<String> printCode(){
		return new ResponseEntity<>("Hello",HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveBrand(@RequestBody Brand brand){
		return new ResponseEntity<>(brand.toString(),HttpStatus.OK);
	}
}
