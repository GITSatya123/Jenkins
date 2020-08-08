package com.st.processor;

import org.springframework.batch.item.ItemProcessor;

import com.st.model.Student;

public class StudentProcessor implements ItemProcessor<Student, Student>{

	@Override
	public Student process(Student item) throws Exception {
		var totalmark=item.getTotalMarks();
		var marksecured=item.getMarkSecured();
		var percentage=marksecured/totalmark*100;
		item.setPercentage(percentage);
		return item;
	}

}
