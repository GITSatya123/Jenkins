package com.st.consumer;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AddressRestConsumer {

	@Autowired
	private LoadBalancerClient client;
	
	public String getAddrsData() {
	
		//get one service instance object using sid
	ServiceInstance si=	client.choose("ADDRESS-SERVICE");
	
	//get URI from SI
	URI uri=si.getUri();
	
	String url=uri + "/address/data";
	
	//take RestTemplate object
	
	RestTemplate rt= new RestTemplate();
	ResponseEntity<String> resp=rt.getForEntity(url, String.class);
	
	//return body data
	return resp.getBody();
	
	}
}
