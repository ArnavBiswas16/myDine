package com.foodDelivery.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodDelivery.mail.dto.MailDto;
import com.foodDelivery.mail.service.MailService;


@RestController
@RequestMapping("/mail")
public class MailController {

	@Autowired
	private MailService mailService;
	
	@Autowired
	private JavaMailSender javaMailSender;

//	@PostMapping(value = "/test")
//	public String sendMail() {
//		return "got data";
//	}
	
	@PostMapping(value = "/sendMail")
	public void sendMail(@RequestBody MailDto mailDto) {
		javaMailSender.send(mailService.registrationSuccessMail(mailDto.getEmail(), mailDto.getName()));
	}

}
