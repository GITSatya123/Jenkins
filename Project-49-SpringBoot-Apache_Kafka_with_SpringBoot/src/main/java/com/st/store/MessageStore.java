package com.st.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageStore {

	public List<String> list= new ArrayList<>();
	public  void putmsg(String message) {
		list.add(message);
	}
	
	public String getMessage() {
		return list.toString();
	}
	
}
