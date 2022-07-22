package com.foodDelivery.restaurant.service.controller;

import com.foodDelivery.restaurant.service.dto.CategoryDto;
import com.foodDelivery.restaurant.service.dto.CategoryDtoWrapper;
import com.foodDelivery.restaurant.service.model.Category;
import com.foodDelivery.restaurant.service.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryService;

    @PostMapping(value = "/add")
    public List<Category> addCategory(@RequestBody CategoryDtoWrapper categoryDtoWrapper){
        List<CategoryDto> categoryDtos = new ArrayList<CategoryDto>();
        categoryDtos.addAll(categoryDtoWrapper.getCategoryDtoList());
        return categoryService.addCategory(categoryDtos);
    }

    @GetMapping(value = "getByRestId/{id}")
    public List<Category> getCategoryByRestId(@PathVariable int id){

        return categoryService.getCategoryListByRestaurantId(id);
    }
}
