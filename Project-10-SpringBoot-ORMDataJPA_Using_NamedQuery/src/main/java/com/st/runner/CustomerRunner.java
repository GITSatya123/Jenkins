package com.st.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.model.Customer;
import com.st.repo.CustomerRepo;

@Component
public class CustomerRunner implements CommandLineRunner{

	//@Autowired
	//private CustomerRepo repo;
	@Autowired
	private EntityManagerFactory emf;
	
	
	@Override
	public void run(String... args) throws Exception {
	
		/*repo.save(new Customer(50, "raj", "rayagada", "male", 27));
		repo.save(new Customer(51, "maman", "bhadrak", "female", 13));
		repo.save(new Customer(52, "ankit", "baripada", "male", 45));
		repo.save(new Customer(53, "anuu", "jajpur", "female", 25));
		repo.save(new Customer(54, "sachin", "bbsr", "male", 35));
		repo.save(new Customer(55, "sisir", "ctc", "male", 26));*/
		//data inserted by using Entity manager
		
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		/*em.persist(new Customer(60, "jeet", "hyd", "male", 26));
		et.commit();
		System.out.println("REcord Inserted");*/
		
		//fetch data
		//Customer c=em.find(Customer.class, 60);
		//System.out.println(c);
		
		
		//Execute named query
		em.createNamedQuery("Customer.getCustomerNameByAddrs", String.class)
		.setParameter("Addrs","ctc")
		.getResultList().forEach(System.out::println);
		
		
		//repo.getCustomerNameByAddrs("female").forEach(System.out::println);
		//repo.getCustomerAddrsByAddrs(25).forEach(System.out::println);
	}
}
