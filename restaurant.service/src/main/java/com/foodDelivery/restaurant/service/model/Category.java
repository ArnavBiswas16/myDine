package com.foodDelivery.restaurant.service.model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "category")
    private String category;

    @Column(name = "fkRestaurantId")
    private int fkRestaurantId;

    public Category() {
    }

    public Category(String category, int fkRestaurantId) {
        this.category = category;
        this.fkRestaurantId = fkRestaurantId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
