package com.foodDelivery.user.service.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodDelivery.user.service.Repository.UserRepository;
import com.foodDelivery.user.service.dto.RegistrationDTO;
import com.foodDelivery.user.service.model.User;
import com.foodDelivery.user.service.model.UserType;

@Service
public class UserServiceImpl implements UserService{

	@Autowired 
	private UserRepository userRepo;

	@Autowired
	private RabbitTemplate template;

	@Override
	public User addUser(RegistrationDTO registrationDTO) {
		User user = registrationToEmployeeModelMapper(registrationDTO);

		user = userRepo.save(user);
		return user;
	}

	@Override
	public User getUserById(int id) {

		User user = userRepo.findById(id).get();
		return user;
	}

	@Override
	public void delUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateUser(int id, RegistrationDTO registrationDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	private User registrationToEmployeeModelMapper(RegistrationDTO registrationDTO) {
			
			User user = new User();
			user.setUserName(registrationDTO.getUserName());
			user.setPassword(registrationDTO.getPassword());
			user.setEmail(registrationDTO.getEmail());
			user.setUserType(registrationDTO.getUserType());
			
			return user;
		}
	
}
