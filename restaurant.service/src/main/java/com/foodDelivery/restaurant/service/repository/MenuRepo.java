package com.foodDelivery.restaurant.service.repository;

import com.foodDelivery.restaurant.service.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepo extends JpaRepository<Menu, Integer> {

    List<Menu> findByFkRestaurantId(int restId);
}
