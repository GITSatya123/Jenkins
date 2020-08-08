package com.st.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution je) {
		System.out.println("Before Job Listener:"+je.getStatus());

	}

	@Override
	public void afterJob(JobExecution je) {
		System.out.println("After Job Listener:"+je.getStatus());

	}

}
