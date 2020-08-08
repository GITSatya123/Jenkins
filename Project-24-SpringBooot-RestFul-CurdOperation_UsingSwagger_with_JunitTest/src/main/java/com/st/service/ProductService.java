package com.st.service;

import java.util.List;
import java.util.Optional;

import com.st.model.Product;

public interface ProductService {

	public Integer saveProduct(Product p);
	public void updateProduct(Product p);
	public void deleteProduct(Integer id);
	public Optional<Product> getOneProduct(Integer id);
	public List<Product> getAllProduct();
	public boolean isProductExist(Integer id);
	
	
}