package com.st.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class NITMailService {
	
	@Autowired
	private JavaMailSender sender;
	
	public boolean sendEmail(String to,String cc[],String bcc [],String subject,String text,
									 FileSystemResource file) {
		boolean flag=false;
		
		try {
			//create mimeMessage
			MimeMessage message=sender.createMimeMessage();
			//create MimeMessageHelper
			MimeMessageHelper helper= new MimeMessageHelper(message,file!=null?true:false);
			//provides message details
			helper.setTo(to);
			if(cc!=null)
				helper.setCc(cc);
			if(bcc!=null)
				helper.setBcc(bcc);
			helper.setSubject(subject);
			helper.setText(text);
			if(file!=null)
				//if file exist then send
				helper.addAttachment(file.getFilename(), file);
			//send email
			sender.send(message);
			flag=true;
		}catch(Exception e) {
			flag=false;
			e.printStackTrace();
		}
		return flag;
		}
	
}

