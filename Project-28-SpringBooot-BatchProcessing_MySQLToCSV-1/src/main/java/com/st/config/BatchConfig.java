package com.st.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.st.listener.StudentListener;
import com.st.model.Student;
import com.st.processor.StudentProcessor;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

	@Bean
	public ItemReader<Student> reader() {
		JdbcCursorItemReader<Student> reader=new JdbcCursorItemReader<>();
		//provide sql query
		reader.setSql("SELECT sid,sname,sfees,totalmarks,marksecured,percentage FROM student_tab");
		//connect to database
		reader.setDataSource(dataSource());
		reader.setRowMapper(
				(rs,rowMap)-> new Student(rs.getInt("sid"),rs.getString("sname"),
						rs.getDouble("sfees"),rs.getDouble("totalmarks"),
						rs.getDouble("marksecured"),rs.getDouble("percentage")));
				
		return reader;
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/ashokproject");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}

	@Bean
	public ItemProcessor<Student, Student> processor(){
		return new StudentProcessor();
	}
	
	@Bean
	public ItemWriter<Student> writer() {
		FlatFileItemWriter<Student> writer=new FlatFileItemWriter<>();
		//File location
		writer.setResource(new FileSystemResource("E://batchoutput//student.csv"));
		//create one line based on one object
		writer.setLineAggregator(new DelimitedLineAggregator<Student>() {{
			setDelimiter(",");
			setFieldExtractor(new BeanWrapperFieldExtractor<Student>() {{
				setNames(new String[] {"stdId","stdName","stdFees","totalMarks","markSecured","percentage"});
			}});
		}});
		return writer;
	}
	
	@Autowired
	private  StepBuilderFactory sf;
	
	@Bean
	public Step stepA() {
		return sf.get("stepA")
				.<Student,Student>chunk(3)
				.reader(reader())
				.processor(processor())
				.writer(writer())
				.build();
	}
	
	@Autowired
	private JobBuilderFactory jf;
	
	@Bean
	public Job jobA() {
		return jf.get("jobA")
				.incrementer(new RunIdIncrementer())
				.listener(listener())
				.start(stepA())
				.build();
	}
	
	@Bean
	public JobExecutionListener listener() {
		return new StudentListener();
	}
}
