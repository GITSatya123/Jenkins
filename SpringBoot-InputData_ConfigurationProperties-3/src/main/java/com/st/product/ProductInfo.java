package com.st.product;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProductInfo {

	private int pId;
	private String pName;
	private float price;
	//private List<String> remarks;
	private Map<String, Object> remarks;
}
