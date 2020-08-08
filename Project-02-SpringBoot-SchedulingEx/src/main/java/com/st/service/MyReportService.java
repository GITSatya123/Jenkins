package com.st.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyReportService {

	//@Scheduled(initialDelay = 6000,fixedRate =  7000)
	  @Scheduled(cron = "05    0   *   *   *   * ")	
	public void genRepo() {
		System.out.println("Hello:"+new Date());
	}
	
}
