package com.st.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	private Integer prodId;
	private String prodName;
	private Double prodCost;
	
	private Double prodDiscount;
	private Double prodGst;
	private Double totalCost;
}
