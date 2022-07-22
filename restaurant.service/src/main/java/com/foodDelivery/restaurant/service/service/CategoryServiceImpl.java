package com.foodDelivery.restaurant.service.service;

import com.foodDelivery.restaurant.service.dto.CategoryDto;
import com.foodDelivery.restaurant.service.model.Category;
import com.foodDelivery.restaurant.service.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public List<Category> addCategory(List<CategoryDto> categoryDtoList) {

        List<Category> categoryList = categoryDtoListTocategoryList(categoryDtoList);
        categoryList = categoryRepo.saveAll(categoryList);
        return categoryList;
    }

    private List<Category> categoryDtoListTocategoryList(List<CategoryDto> categoryDtoList){
        List<Category> categoryList = new ArrayList<Category>();
        for(CategoryDto categoryDto : categoryDtoList){
            Category category = new Category();
            category.setCategory(categoryDto.getCategory());
            category.setFkRestaurantId(categoryDto.getFkRestaurantId());
            categoryList.add(category);
        }
        return categoryList;
    }

    @Override
    public List<Category> getCategoryListByRestaurantId(int restId) {
        return categoryRepo.findByFkRestaurantId(restId);
    }

    @Override
    public Category updateCategory(int categoryId) {

        Category category = categoryRepo.getById(categoryId);
        categoryRepo.save(category);
        return null;
    }
}
