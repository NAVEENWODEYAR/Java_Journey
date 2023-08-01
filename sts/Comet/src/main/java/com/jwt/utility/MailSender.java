package com.jwt.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailSender 
{
	// DI
	@Autowired
	JavaMailSender mailSender;
	
	public void sendMail(String body, String subject, String toMail)
	{
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
							simpleMailMessage.setFrom("naveenkrishnawodeyar@gmail.com");
							simpleMailMessage.setTo(toMail);
							simpleMailMessage.setText(body);
							simpleMailMessage.setSubject(subject);
							
							mailSender.send(simpleMailMessage);
							System.out.println("Successfully mail has been delivered.,");
	}
}
