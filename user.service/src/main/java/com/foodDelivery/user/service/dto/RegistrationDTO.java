package com.foodDelivery.user.service.dto;

import com.foodDelivery.user.service.model.UserType;

public class RegistrationDTO {
	
	private String userName;
	private String email;
	private String password;
	private UserType userType;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	
	
	
	
	
	

}
