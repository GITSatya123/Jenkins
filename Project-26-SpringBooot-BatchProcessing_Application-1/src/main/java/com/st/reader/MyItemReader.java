package com.st.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class MyItemReader implements ItemReader<String> {

	String inputs[] = {"Hello","this","is","satyajit"};
	int position;
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		if(position<inputs.length) {
			return inputs[position++];
		}else {
			position=0;
		}
		return null;
	}

}
