package com.foodDelivery.user.service.Controller;

import com.foodDelivery.user.service.dto.MailDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodDelivery.user.service.dto.RegistrationDTO;
import com.foodDelivery.user.service.model.User;
import com.foodDelivery.user.service.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private RabbitTemplate template;

//	@Autowired
//	private MailDto mailDto;

	@PostMapping(value = "/register")
	public User registration(@RequestBody RegistrationDTO registrationDTO) {
		User user = userService.addUser(registrationDTO);

		MailDto mailDto = new MailDto();
		mailDto.setEmail(user.getEmail());
		mailDto.setName(user.getUserName());
		template.convertAndSend("mailQueueTopicExchange", "mailrouting", mailDto);
		return user;
	}
	
	@GetMapping(value = "/getuser/{id}")
	public User getUser(@PathVariable("id") int id) {
		User user = userService.getUserById(id);
		return user;
	}
	
}
