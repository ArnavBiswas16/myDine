package com.foodDelivery.restaurant.service.service;

import com.foodDelivery.restaurant.service.dto.AddRestaurantDto;
import com.foodDelivery.restaurant.service.dto.RestaurantDto;
import com.foodDelivery.restaurant.service.model.Restaurant;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RestaurantService {

    Restaurant addRestaurant(AddRestaurantDto addRestaurantDto);

    Restaurant getRestaurantById(int id);

    ResponseEntity<List<Restaurant>> getRestaurantsByName(String name);


}
