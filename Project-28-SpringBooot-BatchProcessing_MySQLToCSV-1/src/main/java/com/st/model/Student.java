package com.st.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private Integer stdId;
	private String stdName;
	private Double stdFees;
	private Double totalMarks;
	private Double markSecured;
	private Double percentage;
}
