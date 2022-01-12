package com.foodDelivery.mail.service;

import org.springframework.mail.SimpleMailMessage;

public interface MailService {
	
	SimpleMailMessage constructMail(String subject, String body , String userEmail);
	SimpleMailMessage registrationSuccessMail(String email,String name);
}
