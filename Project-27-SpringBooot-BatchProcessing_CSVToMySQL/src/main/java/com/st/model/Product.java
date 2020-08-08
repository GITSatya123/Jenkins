package com.st.model;

import java.io.Serializable;

import lombok.Data;

@Data

public class Product implements Serializable{

	private Integer prodId;
	private String prodCode;
	private double  prodCost;
	private double  prodDisc;
	private double  prodGst;
}
