package com.foodDelivery.restaurant.service.service;

import com.foodDelivery.restaurant.service.dto.RestaurantDto;
import com.foodDelivery.restaurant.service.model.Restaurant;

import java.util.List;

public interface RestaurantService {

    Restaurant addRestaurant(RestaurantDto restaurantDto);

    Restaurant getRestaurantById(int id);

    List<Restaurant> getRestaurantByName(String name);


}
