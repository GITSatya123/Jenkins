package com.st.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="customerInfo")
@AllArgsConstructor
@NoArgsConstructor
//@NamedQuery(name="Customer.getCustomerAddrsByAddrs",query="select Addrs from Customer where age=:age")
public class Customer {

	@Id
	private Integer cNo;
	private String cName;
	private String Addrs;
	private String gender;
	private Integer age;
	
	
	
	
}
