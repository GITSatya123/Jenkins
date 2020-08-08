package com.st.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class StudentListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution je) {
		System.out.println("After job execution:"+je);

	}

	@Override
	public void afterJob(JobExecution je) {
		System.out.println("After job execution:"+je);

	}

}
