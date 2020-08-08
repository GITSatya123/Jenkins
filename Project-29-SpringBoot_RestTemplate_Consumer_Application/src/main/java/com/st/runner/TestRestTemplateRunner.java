package com.st.runner;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestRestTemplateRunner implements CommandLineRunner{

	@Autowired
	private RestTemplate template;
	
	@Override
	public void run(String... args) throws Exception {
		
		String url="http://localhost:8080/emp/obj/0";
		
		try {
			ResponseEntity<String> res=template.getForEntity(url, String.class);
			
			if(res.getStatusCodeValue()==200) {
				System.out.println(res.getStatusCode());
				System.out.println(res.getHeaders().getContentType());
				System.out.println(res.getBody());
				System.out.println(res.getStatusCode().name());
			}
		}catch(Exception e) {
			String msg=e.getMessage();
			System.out.println(msg);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//1.step-1 Define one Url
		
		//String url="http://localhost:8080/emp/message";
		//String url="http://localhost:8080/emp/object";
		//String url="http://localhost:8080/emp/col";
		
		//2.create rest template object
		
		//template= new RestTemplate();
		
		//Header param
		//HttpHeaders header=new HttpHeaders();
		//header.add("Content-Type", "application/json");
		
		//input JSON data
		//String body="{\"empId\":101,\"empName\":\"stya\",\"empSal\":330.99}";
		
		//HttpEntity object add (headers+body)
		
		//HttpEntity<String> request=new HttpEntity<String>(body, header);
		//3. invoke producer app (making request and get response)
		
		//ResponseEntity<String> response=template.getForEntity(url, String.class);
		
		//4.print/use response details
		
		//System.out.println(response.getStatusCodeValue());
		//System.out.println(response.getStatusCode().name());
		//System.out.println(response.getBody());
		//System.out.println(response.getHeaders().getContentType());
		//System.exit(0);
	}

}
