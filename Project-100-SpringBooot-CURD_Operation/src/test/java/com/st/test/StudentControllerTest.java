package com.st.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.st.controller.StudentController;
import com.st.service.StudentService;
import com.st.validator.StudentValidator;

@RunWith(SpringRunner.class)
@WebMvcTest(value=StudentController.class)
public class StudentControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private StudentService service;
	
	@MockBean
	private StudentValidator validator;
	
	@Test
	public void validateTest() throws Exception{
		
		when(service.deleteStudent(101)).thenReturn("IN-VALID");
		MockHttpServletRequestBuilder req=MockMvcRequestBuilders.get("/student/delete");
		MvcResult result=mockMvc.perform(req).andReturn();
		MockHttpServletResponse response=result.getResponse();
		String rStatus=response.getContentAsString();
		System.out.println("ResponseStatus::"+response);
		assertEquals("In valid",rStatus);
	}
}
