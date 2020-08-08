package com.st.service;

import java.util.List;

import com.st.model.Product;

public interface ProductService {

	public void saveProduct(Product p);
	public List<Product> getAllProducts();
	public void deleteProduct(Integer id);
	public Product getoneProduct(Integer id);
	public void updateProduct(Product p);
}
