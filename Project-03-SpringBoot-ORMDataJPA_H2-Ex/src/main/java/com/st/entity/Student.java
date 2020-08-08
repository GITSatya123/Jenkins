package com.st.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="StudentRepo")
public class Student {
	
	@Id
	@Column(name="sId")
	private Integer	 studentid;
	@Column(name="sName")
	private String studentName;
	@Column(name="sFees")
	private double fees;
}
