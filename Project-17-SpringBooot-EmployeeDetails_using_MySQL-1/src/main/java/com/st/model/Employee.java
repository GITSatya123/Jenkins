package com.st.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue	
	private Integer empNo;
	private String empName;
	private String gender;
	private Integer age;
	private String empDept;
	private String empDesg;
	private String empAddrs;
	private String empLangs;
	private String empProj;
}
