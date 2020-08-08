package com.st.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Document
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {

	@Id
	private String id;
	@NonNull
	private Integer sid;
	@NonNull
	private String name;
	@NonNull
	private String gender;
}
