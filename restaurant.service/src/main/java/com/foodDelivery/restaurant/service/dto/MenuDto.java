package com.foodDelivery.restaurant.service.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class MenuDto {

    private int fkRestaurantId;

    private String foodName;

    private String fkCategoryId;

    private int price;

    private String description;

    private String imgPath;

    public int getFkRestaurantId() {
        return fkRestaurantId;
    }

    public void setFkRestaurantId(int fkRestaurantId) {
        this.fkRestaurantId = fkRestaurantId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFkCategoryId() {
        return fkCategoryId;
    }

    public void setFkCategoryId(String fkCategoryId) {
        this.fkCategoryId = fkCategoryId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
