package com.st.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisClusterConnection;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisSentinelConnection;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.st.model.Student;

@Configuration
public class AppConfig {

	//create Redis Connction  
	@Bean
	public RedisConnectionFactory cf() {
		return new LettuceConnectionFactory(); 
	}
	
	//create redis template
	@Bean
	public RedisTemplate<String, Student> rt(){
		RedisTemplate<String, Student> template=new RedisTemplate<>();
		template.setConnectionFactory(cf());
		return template;
	}
			
				
}
