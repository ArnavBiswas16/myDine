package com.foodDelivery.restaurant.service.dto;

import javax.persistence.*;

public class CategoryDto {

    private String category;

    private int fkRestaurantId;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getFkRestaurantId() {
        return fkRestaurantId;
    }

    public void setFkRestaurantId(int fkRestaurantId) {
            this.fkRestaurantId = fkRestaurantId;
        }

}
