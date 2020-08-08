package com.st.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student  implements Serializable{

	private Integer stdId;
	private String stdName;
	private String stdGender;
	private double stdFees;
}
