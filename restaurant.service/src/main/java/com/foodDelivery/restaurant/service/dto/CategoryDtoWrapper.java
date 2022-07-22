package com.foodDelivery.restaurant.service.dto;

import java.util.List;

public class CategoryDtoWrapper {
    List<CategoryDto> categoryDtoList;

    public List<CategoryDto> getCategoryDtoList() {
        return categoryDtoList;
    }

    public void setCategoryDtoList(List<CategoryDto> categoryDtoList) {
        this.categoryDtoList = categoryDtoList;
    }
}
