package com.st.response;

import java.util.Date;

import lombok.Data;
 
@Data
//@XmlRootElement
public class TicketInfo {

	private String name;
	private String from;
	private String to;
	private String flightId;
	private Date journeyDate;
	private double ticketPrice;
	private String ticketStatus;
}
