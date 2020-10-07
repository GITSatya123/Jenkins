package com.st.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.st.store.MessageStore;


@Component
public class ConsumerService {
private Logger log=LoggerFactory.getLogger(ConsumerService.class);
	@Autowired
	private MessageStore ms;
	
	@KafkaListener(topics="${my.app.tpc}", groupId="groupId")
	public void consumeMessage(String message) {
	log.info("Consumer Received Message:"+message);
		ms.putmsg(message);
	}
}
