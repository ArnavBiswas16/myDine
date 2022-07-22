package com.foodDelivery.restaurant.service.dto;

import java.time.LocalTime;

public class AddRestaurantDto {

    private String name;

    private String cuisine;

    private LocalTime operationStartTime;

    private LocalTime operationEndTime;

    private int isOpen;

    private long phone;

    private String city;

    private int pincode;

    private String place;

    private float latitude;

    private float longitude;

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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
