package com.st.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;



@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:application-test.properties")
@DisplayName("SPRINGBOOT PRODUCT TEST CASE")
public class MokitoTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	@DisplayName("GET ONE PRODUCT BY ID")
	public void testGetOne() throws Exception {
		//1.Construct http request object
		MockHttpServletRequestBuilder request=MockMvcRequestBuilders.get("/rest/p/one/8");
		
		//2.Execute request and get result
		MvcResult result=mvc.perform(request).andReturn();
		
		//3. Read response from result
		MockHttpServletResponse responce=result.getResponse();
		
		//4.Assert response data
		assertEquals(HttpStatus.OK.value(),responce.getStatus());
		assertNotNull(responce.getContentAsString());
		if(!responce.getContentType().contains("application/json")) {
			fail("MAY NOT BE JSON DATA!!");
		}
	}
	
	@Test
	@DisplayName("Get All Product Data")
	public void testfetchAllProduct() throws Exception {
		//1.construct http request object
		MockHttpServletRequestBuilder request=MockMvcRequestBuilders.get("/rest/p/all");
		
		//2.execute response from result
		MvcResult result=mvc.perform(request).andReturn();
		//3.read responce from default
		MockHttpServletResponse response=result.getResponse();
		//assert response data
		assertEquals(HttpStatus.OK.value(),response.getStatus());
		assertNotNull(response.getContentAsString());
		if(!response.getContentType().contains("application/json")) {
			fail("May not be json Data");
		}
	}
	
	@Test
	@DisplayName("Save Product")
	public void testsave() throws Exception {
		//1.construct http request object
		MockHttpServletRequestBuilder request=MockMvcRequestBuilders.post("/rest/p/save")
				.header("Content-Type", "application/json")
				.content("{\"pname\" : \"Fan\",\"price\" : \"8799.88\",\"warrenty\" : \"2\"}");
		
		//2.execute response result
		MvcResult result=mvc.perform(request).andReturn();
		//3.read response data
		MockHttpServletResponse response=result.getResponse();
		
		//4.assert responcedata
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		assertNotNull(response.getContentAsString());
		if(response.getContentAsString().contains("created successfully")) {
			fail("product may not be saved");
		}
	}
	
	@Test
	@DisplayName("DELETE Product")
	public void testDelete() throws Exception {
		//1.create http request object
		MockHttpServletRequestBuilder request=MockMvcRequestBuilders.delete("/rest/p/delete/11");
		//2.execute response result
		MvcResult result=mvc.perform(request).andReturn();
		//3.read response data
		MockHttpServletResponse response=result.getResponse();
		//assert response data
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		assertNotNull(response.getContentAsString());
		if(!response.getContentType().contains("Deleted")) {
		fail("product might not be deleted");
		}
	}

		
}
