package com.st.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.st.listener.MyJobListener;
import com.st.processor.MyItemProcessor;
import com.st.reader.MyItemReader;
import com.st.writer.MyItemWriter;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

	//1. Item Reader
	@Bean
	public ItemReader<String> reader(){
		return new MyItemReader();
	}
	
	//2. Item processor
	@Bean
	public ItemProcessor<String , String> processor(){
		return new MyItemProcessor();
	}
	
	//3. Item Writer
	@Bean
	public ItemWriter<String> writer(){
		return new MyItemWriter();
	}
	
	//4.StepBuilderFactory
	@Autowired
	private StepBuilderFactory sf;
	
	//5.create step
	@Bean
	public Step stepA() {
		return sf.get("stepA").//step name
				<String,String>chunk(2)//chunk size
				.reader(reader()).processor(processor()).writer(writer()).build();//reader/processor/writer object
	}
	
	//6. JobBuilderFactory
	@Autowired
	private JobBuilderFactory jf;
	
	//7.job
	@Bean
	public Job jobA() {
		return jf.get("jobA")
				.incrementer(new RunIdIncrementer())
				.listener(new MyJobListener())
				.start(stepA())	
				//.start(stepB())
				.build();
	}

}
