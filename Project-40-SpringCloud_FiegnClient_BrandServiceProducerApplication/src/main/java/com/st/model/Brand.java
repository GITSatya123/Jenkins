package com.st.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brand {

	private Integer bId;
	private String bCode;
	private String bName;
	private String bNote;
}