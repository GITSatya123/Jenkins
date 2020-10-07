package com.st.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.st.model.Student;

@Component
public class StudentValidator implements Validator{

	//Allow object class model 
	@Override
	public boolean supports(Class<?> clazz) {
		
		return  Student.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//type cast
		Student s=(Student) target;
		
		//validator logic
		if(s.getStdName()==null || s.getStdName().isEmpty()) {
			errors.rejectValue("stdName", null,"Please enter Student Name");
		}
		else if(!Pattern.matches("[a-z]{2,10}",s.getStdName())) {
			errors.rejectValue("stdName",null,"please enter valid student name");
		}
		if(s.getStdGen()==null|| s.getStdGen().isEmpty()) {
			errors.rejectValue("stdGen", null,"please choose Gender");
		}
		if(s.getStdPwd()==null||s.getStdPwd().isEmpty()) {
			errors.rejectValue("stdPwd", null,"Enter a password");
		}else if(!Pattern.matches("[A-Za-z0-9\\\\s\\\\,\\\\.\\\\-]{1,100}", s.getStdPwd())) {
			errors.rejectValue("stdPwd", null,"Enter valid password");
		}
		if(s.getStdAddrs()==null||s.getStdAddrs().isEmpty()||s.getStdAddrs().length()<10) {
			errors.rejectValue("stdAddrs", null,"Enter Address  atleast 10chars!");
			
		}
			else if(!Pattern.matches("[A-Za-z0-9\\s\\,\\.\\-]{1,100}", s.getStdAddrs())) {
				errors.rejectValue("stdAddrs", null,"Enter Address  atleast 1-10chars!");		
		}
		if(s.getStdCourse()==null||s.getStdCourse().isEmpty()) {
			errors.rejectValue("stdCourse", null,"please choose one course!");
		}
		if(s.getStdLangs()==null||s.getStdLangs().isEmpty()) {
			errors.rejectValue("stdLangs", null,"choose a language");
		}
		
	}

}
