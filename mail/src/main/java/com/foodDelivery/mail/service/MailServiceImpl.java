package com.foodDelivery.mail.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService{

	@Override
	public SimpleMailMessage constructMail(String subject, String body, String userEmail) {
		
		SimpleMailMessage email = new SimpleMailMessage();
	    email.setSubject(subject);
	    email.setText(body);
	    email.setTo(userEmail);
	    email.setFrom("anju.k302@gmail.com");
	    
	    return email;
	}

	@Override
	public SimpleMailMessage registrationSuccessMail(String email, String name) {

		String prefix = "Hello"+ name;
		String body = "You account for MyDine has been created successfully!";
		String subject = "MyDine Welcomes you";
		
		return constructMail(subject, prefix+body, email);		
	}

}
