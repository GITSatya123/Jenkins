package com.st.model;

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
@Table(name="Staff_info")
public class StaffDetails {

	@Id
	private Integer staffNo;
	private String staffName;
	private String gender;
	private Integer age;
	private Double salary;
}
