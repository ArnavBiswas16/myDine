package com.foodDelivery.restaurant.service.model;

import javax.persistence.*;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "fkRestaurantId")
    private int fkRestaurantId;

    @Column(name = "foodName")
    private String foodName;

    @Column(name = "fkCategoryId")
    private String fkCategoryId;

    @Column(name = "price")
    private int price;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "imgPath", nullable = true)
    private String imgPath;

    public Menu() {
    }

    public Menu(int fkRestaurantId, String foodName, String fkCategoryId, int price, String description, String imgPath) {
        this.fkRestaurantId = fkRestaurantId;
        this.foodName = foodName;
        this.fkCategoryId = fkCategoryId;
        this.price = price;
        this.description = description;
        this.imgPath = imgPath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
