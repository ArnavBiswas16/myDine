package com.foodDelivery.restaurant.service.model;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "cuisine")
    private String cuisine;

    @Column(name = "operationStartTime")
    private LocalTime operationStartTime;

    @Column(name = "operationEndTime")
    private LocalTime operationEndTime;

    @Column(name = "isOpen")
    private int isOpen;

    @Column(name = "fkAddressId")
    private int fkAddressId;

    @Column(name = "phone")
    private long phone;

    public Restaurant() {
    }

    public Restaurant(String name, String cuisine, LocalTime operationStartTime, LocalTime operationEndTime, int isOpen, int fkAddressId, long phone) {
        this.name = name;
        this.cuisine = cuisine;
        this.operationStartTime = operationStartTime;
        this.operationEndTime = operationEndTime;
        this.isOpen = isOpen;
        this.fkAddressId = fkAddressId;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public LocalTime getOperationStartTime() {
        return operationStartTime;
    }

    public void setOperationStartTime(LocalTime operationStartTime) {
        this.operationStartTime = operationStartTime;
    }

    public LocalTime getOperationEndTime() {
        return operationEndTime;
    }

    public void setOperationEndTime(LocalTime operationEndTime) {
        this.operationEndTime = operationEndTime;
    }

    public int getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(int isOpen) {
        this.isOpen = isOpen;
    }

    public int getFkAddressId() {
        return fkAddressId;
    }

    public void setFkAddressId(int fkAddressId) {
        this.fkAddressId = fkAddressId;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
