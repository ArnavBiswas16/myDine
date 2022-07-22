package com.foodDelivery.restaurant.service.repository;

import com.foodDelivery.restaurant.service.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

    List<Category> findByFkRestaurantId(int id);
}

