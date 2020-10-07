package com.st.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.st.producer.ProducerService;
import com.st.store.MessageStore;

@RestController
@RequestMapping("/kafka")
public class KafkaRestController {

private Logger log =LoggerFactory.getLogger(KafkaRestController.class);
	@Autowired
	private MessageStore ms;
	
	@Autowired
	private ProducerService service;
	
	@GetMapping("/send")
	
	public String sendMessage(@RequestParam String message) {
		log.info("About to call consumer");
		service.sendMessage(message);
		log.info("Message sent using consumer:"+message);
		return "DONE";
	}
	
	public String getAll() {
		log.info("About to read all message");
		String message=ms.getMessage();
		return message;
	}
}
