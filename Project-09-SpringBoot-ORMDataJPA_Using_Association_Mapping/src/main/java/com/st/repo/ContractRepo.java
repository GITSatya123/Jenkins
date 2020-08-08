package com.st.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.model.Contract;


public interface ContractRepo extends JpaRepository<Contract, Integer>{

}
