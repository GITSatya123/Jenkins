package com.st.model;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendor {

	private Integer vid;
	private String vname;
	private String vtype;
	private List<String> model;
	private String[] info;
	private Map<String, String> details;
	private Address address;
	
}
