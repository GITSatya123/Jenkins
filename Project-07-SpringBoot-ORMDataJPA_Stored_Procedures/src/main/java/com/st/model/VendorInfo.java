package com.st.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Vendor")
public class VendorInfo {

	@Id
	private Integer vId;
	private String vName;
	private String gender;
	private Integer age;
	@Transient
	private String vCode;
	
}
