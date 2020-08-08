package com.st.inputdata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("my.module")
public class ProjectDataRunner implements CommandLineRunner{

	private int id;
	private String name;
	// List<String> subjects; 
	//Set<String> subjects;
	
	private Map<String, Double> marks;
	private String [] modules;
	

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Double> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Double> marks) {
		this.marks = marks;
	}
	public String[] getModules() {
		return modules;
	}

	public void setModules(String[] modules) {
		this.modules = modules;
	}

	@Override
	public String toString() {
		return "ProjectDataRunner [id=" + id + ", name=" + name + ", marks=" + marks + ", modules="
				+ Arrays.toString(modules) + "]";
	}

	

	
	
	
}