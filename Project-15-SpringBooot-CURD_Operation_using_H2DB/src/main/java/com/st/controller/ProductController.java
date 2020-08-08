package com.st.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.st.model.Product;
import com.st.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	//1. show product register page
	
	@GetMapping("/reg")
	public String showPage() {
		return "productRegister";
	}
	
	//2.on click submit button , read from data
	@PostMapping("/save")
	public String saveData(@ModelAttribute Product product,Model model) {
		service.saveProduct(product);
		model.addAttribute("info", "Product'"+product.getProdId()+"'is Saved!");
		return "productRegister";
	}
	
	//3.Get Data from DB and Display in UI
	@GetMapping("/all")
	public String getAllData(Model model) {
		List<Product> list=service.getAllProducts();
		model.addAttribute("list", list);
		return "productData";
	}
	//4.Delete one row based on ID
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id) {
		service.deleteProduct(id);
		return "redirect:all";
	}
	
	//Edit data based on data
	@GetMapping("/edit")
	public String showEdit(@RequestParam Integer id,Model model ) {
		Product p=service.getoneProduct(id);
		model.addAttribute("pob", p);
		return "productEdit";
		
	}
	@PostMapping("/update")
	public String updateData(@ModelAttribute Product product) {
		service.updateProduct(product);
		return "redirect:all";
	}
	
	
	
}