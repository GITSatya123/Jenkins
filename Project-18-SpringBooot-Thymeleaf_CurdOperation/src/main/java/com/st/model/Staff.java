package com.st.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Staff {

	@Id
	@GeneratedValue
	private Integer staffId;
	private String staffName;
	private String gender;
	private Double staffSal;
	private String staffDept;
	
}
