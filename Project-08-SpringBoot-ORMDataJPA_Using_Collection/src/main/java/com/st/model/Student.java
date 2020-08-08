package com.st.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="StudentInfo")
public class Student implements Serializable{

	
	  @Id 
	  private Integer sno; 
	  private String schoolname;
	  
	  @ElementCollection
	  @CollectionTable(name="marksTab")
	  @Column(name="marks")
	  @OrderColumn(name="pos") 
	  private List<Integer> marks;
	  @ElementCollection
	  @CollectionTable(name="studentname")
	  @Column(name="stdname") 
	  private Set<String> sname;
	  @ElementCollection
	  @CollectionTable(name="resultTab")
	  @Column(name="data")
	  @MapKeyColumn(name="mk") 
	  private Map<String, String> result;
	 
	
	
	/*/*/
	
}
