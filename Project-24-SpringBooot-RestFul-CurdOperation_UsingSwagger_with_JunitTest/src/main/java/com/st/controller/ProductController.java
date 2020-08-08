package com.st.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.st.model.Product;
import com.st.service.ProductService;

@Controller
@RequestMapping("/rest/p")
public class ProductController {

	@Autowired
	private ProductService service;
	
	//1.Save Product data
	@PostMapping("/save")
	public ResponseEntity<String> saveOneProduct(@RequestBody Product p){
		ResponseEntity<String> resp= null;
		try {
		//check if product data exists
		if(p.getPId()!=null && service.isProductExist(p.getPId())) {
			resp=new ResponseEntity<String>("Given pid"+p.getPId()+"already exists",HttpStatus.BAD_REQUEST);
		}else {
			Integer id=service.saveProduct(p);
			resp=new ResponseEntity<String>("Product data'"+id+"' saved Successfully",HttpStatus.OK);
		}
	}catch(Exception e) {
		resp=new ResponseEntity<String>("unable to save Product Data",HttpStatus.INTERNAL_SERVER_ERROR);
		e.printStackTrace();
		}
	return resp;
	}
	
	//2.get one product 
	@GetMapping("/one/{id}")
	public ResponseEntity<?> getOneProduct(@PathVariable Integer id){
		ResponseEntity<?> resp=null;
		try {
			Optional<Product> opt=service.getOneProduct(id);
			if(opt.isPresent()) {//if product data exist
				Product p=opt.get();
				resp=new ResponseEntity<Product>(p,HttpStatus.OK);
			}else {
				resp=new ResponseEntity<String>("Product data is '"+id+"' is not exist",HttpStatus.BAD_REQUEST);
			}
		}catch(Exception e) {
			resp=new ResponseEntity<String>("unable to fetch Product Data",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();

		}
		return resp;
	}
	
	//3. delete product data
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProductData(@PathVariable Integer id){
		ResponseEntity<String> resp=null;
		try {
			if(service.isProductExist(id)) {
			service.deleteProduct(id);
			resp=new ResponseEntity<String>("Product'"+id+"' deleted successfully",HttpStatus.OK );
			}else {
				resp=new ResponseEntity<String>("Product'"+id+"' not exists",HttpStatus.BAD_REQUEST );
			}
	}catch(Exception e) {
		resp=new ResponseEntity<String>("unable to delete Product Data",HttpStatus.INTERNAL_SERVER_ERROR);
		e.printStackTrace();
		}
		return resp;
	}
	//4.get All product data
	@GetMapping("/all")
	public ResponseEntity<?> getAllProductData(){
		ResponseEntity<?> resp=null;
		try {
			List<Product> list=service.getAllProduct();
			resp=new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}catch(Exception e) {
		resp=new ResponseEntity<String>("unable to fetch All Product Data",HttpStatus.INTERNAL_SERVER_ERROR);
		e.printStackTrace();
		}
		return resp;
	}
	
	//5. update Product data
	
	@PutMapping("/update")		
	public ResponseEntity<String> updateProductData(@RequestBody Product p){
		ResponseEntity<String> resp=null;
		try {
			if(p.getPId()==null && service.isProductExist(p.getPId())) {
			service.updateProduct(p);
			resp=new ResponseEntity<String>("Product data'"+p.getPId()+"' updated",HttpStatus.OK);
			}else {
				resp=new ResponseEntity<String>("Product data'"+p.getPId()+"' updated",HttpStatus.BAD_REQUEST);
			}
	}catch(Exception e) {
		resp=new ResponseEntity<String>("unable to update Product Data",HttpStatus.INTERNAL_SERVER_ERROR);
		e.printStackTrace();
		}
		return resp;
	}
}
