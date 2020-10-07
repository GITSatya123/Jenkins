package com.st.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {

	private Logger log=LoggerFactory.getLogger(ProducerService.class);
	@Autowired
	private KafkaTemplate<String, String> template;
	
	@Value("${my.app.tpc}")
	private String topicName;
	
	public void sendMessage(String message) {
		log.info("Message at Producer"+message);
		template.send(topicName, message);
	}
}
