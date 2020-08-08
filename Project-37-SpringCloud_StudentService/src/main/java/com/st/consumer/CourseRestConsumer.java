package com.st.consumer;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CourseRestConsumer {

	@Autowired
	private DiscoveryClient client;
	
	public String communicateWithCourse() {
		
		List<ServiceInstance> list= client.getInstances("COURSE-DETAILS");
		
		ServiceInstance si=list.get(0);
		
		URI uri=si.getUri();
		String path="/course/details";
		
		String url=uri+path;
		
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> response=rt.getForEntity(url, String.class);
		String message=response.getBody();
		return message;
	}
}
