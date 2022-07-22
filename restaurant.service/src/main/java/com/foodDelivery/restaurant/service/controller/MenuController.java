package com.foodDelivery.restaurant.service.controller;

import com.foodDelivery.restaurant.service.dto.MenuDto;
import com.foodDelivery.restaurant.service.dto.MenuDtoWrapper;
import com.foodDelivery.restaurant.service.model.Menu;
import com.foodDelivery.restaurant.service.service.MenuService;
import com.foodDelivery.restaurant.service.service.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/menu")
public class MenuController {
    @Autowired
    private MenuServiceImpl menuService;

    @PostMapping(value = "/add")
    public List<Menu> addMenu(@RequestBody MenuDtoWrapper menuDtoWrapper){
        List<MenuDto> menuDtos = new ArrayList<MenuDto>();
        menuDtos.addAll(menuDtoWrapper.getMenuDtoList());
        return menuService.addMenu(menuDtos);
    }

    @GetMapping(value = "/getMenuByRestaurant/{restId}")
    public List<Menu> getMenuBYRestaurant(@PathVariable  int restId){
        return menuService.getMenuByRestaurant(restId);
    }
}
