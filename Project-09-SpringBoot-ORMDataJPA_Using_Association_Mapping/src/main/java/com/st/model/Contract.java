package com.st.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="contractDetails")
@AllArgsConstructor
@NoArgsConstructor
public class Contract {
	@Id
	private Integer cId;
	private String cType;
	private Double cAmount;
}
