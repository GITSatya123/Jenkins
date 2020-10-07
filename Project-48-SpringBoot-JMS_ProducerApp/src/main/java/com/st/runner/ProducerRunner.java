package com.st.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class ProducerRunner implements CommandLineRunner{

	@Autowired
	private JmsTemplate jt;
	
	@Value("${my.queue.name}")
	private String destinationName;
	@Override
	public void run(String... args) throws Exception {
		
		String text="Welcome to Active MQ!!!!!";
		MessageCreator mc= (ses)-> {
			return ses.createTextMessage(text);
		};
		
		jt.send(destinationName, mc);
	}

}
