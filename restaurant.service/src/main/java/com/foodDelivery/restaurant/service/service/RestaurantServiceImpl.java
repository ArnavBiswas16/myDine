package com.foodDelivery.restaurant.service.service;

import com.foodDelivery.restaurant.service.dto.AddRestaurantDto;
import com.foodDelivery.restaurant.service.dto.RestaurantAddressDto;
import com.foodDelivery.restaurant.service.dto.RestaurantDto;
import com.foodDelivery.restaurant.service.model.Restaurant;
import com.foodDelivery.restaurant.service.model.RestaurantAddress;
import com.foodDelivery.restaurant.service.repository.RestaurantAddressRepo;
import com.foodDelivery.restaurant.service.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService{

    @Autowired
    private RestaurantRepo restaurantRepo;

    @Autowired
    private RestaurantAddressRepo restaurantAddressRepo;

    @Override
    public Restaurant addRestaurant(AddRestaurantDto addRestaurantDto) {

        // save restaurant address
        RestaurantAddress restaurantAddress = AddRestaurantDtoToRestaurantAddressModelMapper(addRestaurantDto);
        restaurantAddress = restaurantAddressRepo.save(restaurantAddress);

        //save restaurant
        Restaurant restaurant = AddRestaurantDtoToRestaurantModelMapper(addRestaurantDto, restaurantAddress.getId());
        restaurant = restaurantRepo.save(restaurant);

        return restaurant;
    }

    @Override
    public Restaurant getRestaurantById(int id) {

        return restaurantRepo.findById(id).get();
    }

    @Override
    public ResponseEntity<List<Restaurant>> getRestaurantsByName(String name){
        return new ResponseEntity<List<Restaurant>>(restaurantRepo.findByName(name), HttpStatus.OK);
    }

    public Restaurant setIsOpen(int id, int status){
        Restaurant restaurant = restaurantRepo.findById(id).get();
        restaurant.setIsOpen(status);
        return restaurantRepo.save(restaurant);
    }


    private Restaurant AddRestaurantDtoToRestaurantModelMapper(AddRestaurantDto addRestaurantDto, int restAddId) {

        Restaurant restaurant = new Restaurant();

        restaurant.setName(addRestaurantDto.getName());
        restaurant.setPhone(addRestaurantDto.getPhone());
        restaurant.setIsOpen(addRestaurantDto.getIsOpen());
        restaurant.setCuisine(addRestaurantDto.getCuisine());
        restaurant.setOperationEndTime(addRestaurantDto.getOperationEndTime());
        restaurant.setOperationStartTime(addRestaurantDto.getOperationEndTime());
        restaurant.setFkAddressId(restAddId);

        return restaurant;
    }

    private RestaurantAddress AddRestaurantDtoToRestaurantAddressModelMapper(AddRestaurantDto addRestaurantDto){

        RestaurantAddress address = new RestaurantAddress();

        address.setCity(addRestaurantDto.getCity());
        address.setPincode(addRestaurantDto.getPincode());
        address.setPlace(addRestaurantDto.getPlace());
        address.setLattitude(addRestaurantDto.getLatitude());
        address.setLongitude(addRestaurantDto.getLongitude());

        return  address;
    }
}
