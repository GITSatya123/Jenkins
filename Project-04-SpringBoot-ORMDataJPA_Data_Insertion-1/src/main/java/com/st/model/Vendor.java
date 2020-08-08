package com.st.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="VendorInfo")
public class Vendor {

	@Id
	@Column(name="Vendor_Id")
	private Integer vid;
	@Column(name="Vendor_Name")
	private String vname;
	@Column(name="Vendor_Addrs")
	private String vaddrs;
	@Column(name="Vendor_Age")
	private Integer vage;
}
