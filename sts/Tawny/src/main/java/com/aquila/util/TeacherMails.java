package com.aquila.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TeacherMails 
{
	// Dependency Injection(Constructor)
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendMail(String toMail, String body, String subject)
	{
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
							simpleMailMessage.setText(toMail);
							simpleMailMessage.setText(body);
							simpleMailMessage.setSubject(subject);
							
							javaMailSender.send(simpleMailMessage);
							System.out.println("Mail sent to the user successfully,");
							log.info("Mail generated,");
	}

}
