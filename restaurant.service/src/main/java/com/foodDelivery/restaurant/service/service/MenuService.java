package com.foodDelivery.restaurant.service.service;

import com.foodDelivery.restaurant.service.dto.MenuDto;
import com.foodDelivery.restaurant.service.model.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> addMenu(List<MenuDto> menuDtoList);
    List<Menu> getMenuByRestaurant(int restId);
}
