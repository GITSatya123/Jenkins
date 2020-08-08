package com.st.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.laptop")
public class MyDataRunner implements CommandLineRunner {

	
	private int id;
	private String name;
	private float version;
	private String color;
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
	public float getVersion() {
		return version;
	}
	public void setVersion(float version) {
		this.version = version;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "MyDataRunner [id=" + id + ", name=" + name + ", version=" + version + ", color=" + color + "]";
	}
	
	

}
