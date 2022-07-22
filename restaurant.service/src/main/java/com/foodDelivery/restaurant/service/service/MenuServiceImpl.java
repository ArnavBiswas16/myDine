package com.foodDelivery.restaurant.service.service;

import com.foodDelivery.restaurant.service.dto.MenuDto;
import com.foodDelivery.restaurant.service.model.Menu;
import com.foodDelivery.restaurant.service.repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuRepo menuRepo;

    @Override
    public List<Menu> addMenu(List<MenuDto> menuDto) {
        List<Menu> menuList = menuDtoToMenu(menuDto);
        menuList = menuRepo.saveAll(menuList);
        return menuList;
    }

    @Override
    public List<Menu> getMenuByRestaurant(int restId) {
        return menuRepo.findByFkRestaurantId(restId);
    }

    private List<Menu> menuDtoToMenu(List<MenuDto> menuDtoList){

        List<Menu> menuList = new ArrayList<Menu>();
        for(MenuDto menuDto : menuDtoList)
        {
            Menu menu = new Menu();
            menu.setDescription(menuDto.getDescription());
            menu.setFkRestaurantId(menuDto.getFkRestaurantId());
            menu.setFoodName(menuDto.getFoodName());
            menu.setImgPath(menuDto.getImgPath());
            menu.setPrice(menuDto.getPrice());
            menu.setFkCategoryId(menuDto.getFkCategoryId());

            menuList.add(menu);
        }

        return menuList;
    }
}
