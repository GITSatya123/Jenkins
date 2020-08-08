package com.st.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.st.request.PassengerInfo;
import com.st.response.TicketInfo;



@RestController
public class TicketBookController {

	@PostMapping("/bookticket")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo pinfo){
		
		TicketInfo ticket= new TicketInfo();
		ticket.setName(pinfo.getName());
		ticket.setTo(pinfo.getTo());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTicketPrice(6000.99);
		ticket.setTicketStatus("Confirmed");
		ticket.setJourneyDate(pinfo.getJourneyDate());
		ticket.setFlightId(pinfo.getFlightId());
		
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
		
	}
}
