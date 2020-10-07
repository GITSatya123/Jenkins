package com.st.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.st.rest.WelcomeRestController;

@RunWith(SpringRunner.class)
@WebMvcTest(value=WelcomeRestController.class)
public class WelcomeRestControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void generateWelcomeMsgTest() throws Exception{
		
		MockHttpServletRequestBuilder getReq=  MockMvcRequestBuilders.get("/welcome/satya");
		MvcResult result=mockMvc.perform(getReq).andReturn();
		MockHttpServletResponse response=result.getResponse();
		System.out.println("Response::"+response.getContentAsString());
		int statusCode=response.getStatus();
		assertEquals(200, statusCode);
	}
}
