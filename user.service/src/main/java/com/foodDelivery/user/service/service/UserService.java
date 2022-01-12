package com.foodDelivery.user.service.service;

import com.foodDelivery.user.service.dto.RegistrationDTO;
import com.foodDelivery.user.service.model.User;

public interface UserService {

	User addUser(RegistrationDTO registrationDTO);
	User getUserById(int id);
	void delUser(int id);
	User updateUser(int id, RegistrationDTO registrationDTO);
}
