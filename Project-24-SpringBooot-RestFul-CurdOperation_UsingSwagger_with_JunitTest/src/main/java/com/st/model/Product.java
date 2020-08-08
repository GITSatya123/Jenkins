package com.st.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue
	protected Integer pId;
	protected String pName;
	protected double price;
	protected Integer warrenty;
}
