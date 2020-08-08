package com.st.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.model.Product;
import com.st.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepo repo;

	@Override
	public Integer saveProduct(Product p) {
		
		return repo.save(p).getPId();
	}

	@Override
	public void updateProduct(Product p) {
		repo.save(p);
		
	}

	@Override
	public void deleteProduct(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public Optional<Product> getOneProduct(Integer id) {
		
		return repo.findById(id);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return repo.findAll();
	}

	@Override
	public boolean isProductExist(Integer id) {
		
		return repo.existsById(id);
	}
	
	
}
