package com.foodDelivery.restaurant.service.service;

import com.foodDelivery.restaurant.service.dto.CategoryDto;
import com.foodDelivery.restaurant.service.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> addCategory(List<CategoryDto> categoryDtoList);
    List<Category> getCategoryListByRestaurantId(int restId);
    Category updateCategory(int categoryId);
}
