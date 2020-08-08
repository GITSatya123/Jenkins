package com.st.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	//List<String>getCustomerAddrsByAddrs(Integer age);
}