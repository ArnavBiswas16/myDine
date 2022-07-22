package com.foodDelivery.restaurant.service.dto;

import java.util.List;

public class MenuDtoWrapper {

    List<MenuDto> menuDtoList;

    public List<MenuDto> getMenuDtoList() {
        return menuDtoList;
    }

    public void setMenuDtoList(List<MenuDto> menuDtoList) {
        this.menuDtoList = menuDtoList;
    }
}
