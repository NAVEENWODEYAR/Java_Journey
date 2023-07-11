package com.dataJpa.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderService
{
	// inject the JMS object.,
	@Autowired
	JavaMailSender myEMail;
	
	public void sendEmail(String toMail, String body, String subject)
	{
		// SimpleMailMessage class..,
		SimpleMailMessage sm = new SimpleMailMessage();
							sm.setFrom("naveenkrishnawodeyar@gmail.com");
							sm.setTo(toMail);
							sm.setSubject(subject);
							sm.setText(subject);
							
							myEMail.send(sm);
							System.out.println("Book added to the list.,");
	}
}
