package com.st.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {

	@Id
	@GeneratedValue
	protected Integer id;
	protected String sname;
	protected String gender;
	protected String standard;
	protected String result;
}
