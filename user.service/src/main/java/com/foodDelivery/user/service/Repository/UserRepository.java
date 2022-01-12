package com.foodDelivery.user.service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodDelivery.user.service.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}	
