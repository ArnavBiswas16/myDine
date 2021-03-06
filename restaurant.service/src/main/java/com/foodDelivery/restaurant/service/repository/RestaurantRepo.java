package com.foodDelivery.restaurant.service.repository;

import com.foodDelivery.restaurant.service.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Integer> {

    List<Restaurant> findByName(String name);
}
