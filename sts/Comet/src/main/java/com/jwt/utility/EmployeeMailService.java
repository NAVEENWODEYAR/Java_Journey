package com.jwt.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMailService 
{

	// DI, object of the class.,
	@Autowired
	JavaMailSender javaMailSender;
	
	public void sendMail(String toMail, String subject, String body)
	{
		SimpleMailMessage sm = new SimpleMailMessage();
							sm.setFrom("naveenkrishnawodeyar@gmail.com");
							sm.setTo(toMail);
							sm.setText(body);
							sm.setSubject(subject);
							
							javaMailSender.send(sm);
							System.out.println("Mail sent to the user.,");
							
	}
	
	public void sendMails(String[] strings,String subject,String body)
	{
		SimpleMailMessage sml = new SimpleMailMessage();
							sml.setFrom("NAVEENKRISHNAWODEYAR@GMAIL.COM");
							sml.setTo(new String[] {});
							sml.setSubject(subject);
							sml.setText(body); 
							
							javaMailSender.send(sml);
	}


}
