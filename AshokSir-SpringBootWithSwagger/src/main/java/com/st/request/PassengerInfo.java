package com.st.request;

import java.util.Date;

import lombok.Data;
//import javax.xml.bind.annotation;


@Data
//@XmlRootElement
public class PassengerInfo {

	private String name;
	private int age;
	private String from;
	private String to;
	private String flightId;
	private Date journeyDate;
}
