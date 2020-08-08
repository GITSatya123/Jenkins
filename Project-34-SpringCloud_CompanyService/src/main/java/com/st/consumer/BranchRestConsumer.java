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
public class BranchRestConsumer {

	@Autowired
	private DiscoveryClient client;
	
	public String communicateWithBranch() {
		
		//communicate with eureka for list<SI> using SID
		List<ServiceInstance> list= client.getInstances("BRANCH-SERVICE");
		
		//choose one SI manually using List index
		ServiceInstance si= list.get(0);
		
		//read URI of SI
		URI uri=si.getUri();
		
		//provide path
		String path="/branch/show";
		
		//create URL
		String url=uri+path;
		
		//create RestTEmplate Object
		RestTemplate rt=new RestTemplate();
		
		//make http request call and get response
		
		ResponseEntity<String> response=rt.getForEntity(url, String.class);
		String message=response.getBody();
		return message;
	}
}
