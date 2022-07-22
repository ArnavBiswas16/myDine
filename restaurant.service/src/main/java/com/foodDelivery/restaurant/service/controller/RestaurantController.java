package com.foodDelivery.restaurant.service.controller;

import com.foodDelivery.restaurant.service.dto.AddRestaurantDto;
import com.foodDelivery.restaurant.service.model.Restaurant;
import com.foodDelivery.restaurant.service.service.RestaurantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantServiceImpl restaurantService;


    @PostMapping(value = "/add")
    public Restaurant addRestaurant(@RequestBody AddRestaurantDto addRestaurantDto){

        Restaurant restaurant = restaurantService.addRestaurant(addRestaurantDto);

        return restaurant;
    }

    @GetMapping(value = "/getById/{id}")
    public Restaurant getRestaurantById(@PathVariable("id") int id){

        return restaurantService.getRestaurantById(id);
    }

    @GetMapping(value = "/getByName/{name}")
    public ResponseEntity<List<Restaurant>> getRestaurantByName(@PathVariable("name") String name){

        return restaurantService.getRestaurantsByName(name);
    }

    @PutMapping(value = "/setIsOpen")
    public Restaurant setIsOpen(@RequestParam int id, int status){

        return restaurantService.setIsOpen(id, status);
    }

}
