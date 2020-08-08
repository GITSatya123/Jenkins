package com.st.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class VendorTime {

	@Id
	private Integer vId;
	private String vName;
	//@Temporal(TemporalType.DATE)
	private Date dateA;
	//@Temporal(TemporalType.TIME)
	private Date dateB;
	//@Temporal(TemporalType.TIMESTAMP)
	private Date dateC;
	
}
