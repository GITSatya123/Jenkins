package com.st.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("satya").password("{noop}anuu").authorities("STUDENT");
		auth.inMemoryAuthentication().withUser("sanu").password("{noop}bably").authorities("EMP");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers("/welcome").permitAll()
		.antMatchers("/emp").hasAuthority("EMPLOYEE")
		.antMatchers("/student").hasAuthority("STUDENT")
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.defaultSuccessUrl("/common",false)
		.and()
		.logout()
		.and()
		.exceptionHandling()
		.accessDeniedPage("/denied");
	}
	
}
