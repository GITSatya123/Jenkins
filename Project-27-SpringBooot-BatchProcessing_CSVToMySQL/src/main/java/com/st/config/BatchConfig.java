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
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.st.listener.MyJobListener;
import com.st.model.Product;
import com.st.processor.MyProductProcessor;

@EnableBatchProcessing
@Configuration
public class BatchConfig {

	//1.FlatFileItemReader Bean
	@Bean
	public ItemReader<Product> reader(){
	 FlatFileItemReader<Product> reader=new FlatFileItemReader<>();
	 //file location with name
	 reader.setResource(new ClassPathResource("products.csv"));
	 //read one line
	 reader.setLineMapper(new DefaultLineMapper<Product>() {{
		//tokenize one line and provide variable name
		 setLineTokenizer(new DelimitedLineTokenizer() {{
		
			setNames("prodId","prodCode","prodCost");
		}}); 
		 //convert into one object
		 setFieldSetMapper(new BeanWrapperFieldSetMapper<Product>() {{
			setTargetType(Product.class); 
		 }});
		
	 }});
	return reader;
	}	
	//2.MyProduct processor
	@Bean
	public ItemProcessor<Product, Product> processor(){
		return new MyProductProcessor();
	}
	
	//3.JdbcBatchItemwriter
	/*@Bean
	public ItemWriter<Product> writer(){
		JdbcBatchItemWriter<Product> writer=new JdbcBatchItemWriter<>();
		writer.setDataSource(dataSource());
		writer.setSql("INSERT INTO PRODUCTS (PRODID,PRODCODE,PRODCOST,PRODDISC,PRODGST) VALUES(:prodId,:prodCode,:prodCost,:prodDisc,:prodGst)");
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Product>());
		return writer;
	}
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring _db");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}*/
	//3. Writer Bean
		@Bean
		public ItemWriter<Product> writer(){
			JdbcBatchItemWriter<Product> writer = new JdbcBatchItemWriter<>();
			//database connection
			writer.setDataSource(dataSource());
			//insert SQL query
			writer.setSql("INSERT INTO PRODUCTS (PRODID,PRODCODE,PRODCOST,PRODDISC,PRODGST) VALUES(:prodId,:prodCode,:prodCost,:prodDisc,:prodGst)");
			//Read object variables -> set data to SQL params
			writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Product>());
			
			return writer;
		}
		
		@Bean
		public DataSource dataSource() {
		 DriverManagerDataSource ds = new DriverManagerDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/spring_db");
			ds.setUsername("root");
			ds.setPassword("root");
			return ds;
		}

	//4.StepBuilderFactory
	@Autowired
	private StepBuilderFactory sf;
	
	//5.StepBean
	@Bean
	public Step stepA() {
		return sf.get("stepA")
				.<Product,Product>chunk(3)
				.reader(reader())
				.processor(processor())
				.writer(writer())
				.build();
				
	}
	
	//6.JobBuilderFactory
	@Autowired
	private JobBuilderFactory jf;
	
	//7.JobBean
	@Bean
	public Job jobA() {
		return jf.get("jobA")
				.incrementer(new RunIdIncrementer())
				.listener( listener())
				.start(stepA())
				.build();
	}
	
	//8.Listener Bean
	@Bean
	public JobExecutionListener listener() {
		return new MyJobListener();
	}
}
