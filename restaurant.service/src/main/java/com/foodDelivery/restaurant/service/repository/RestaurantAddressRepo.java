package com.foodDelivery.restaurant.service.repository;

import com.foodDelivery.restaurant.service.model.RestaurantAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantAddressRepo extends JpaRepository<RestaurantAddress, Integer> {
}
