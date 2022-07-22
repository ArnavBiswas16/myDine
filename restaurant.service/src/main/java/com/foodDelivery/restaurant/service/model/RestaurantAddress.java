package com.foodDelivery.restaurant.service.model;

import javax.persistence.*;

@Entity
@Table(name = "restaurant_address")
public class RestaurantAddress {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "pincode")
    private int pincode;

    @Column(name = "place")
    private String place;

    @Column(name = "lattitude")
    private float lattitude;

    @Column(name = "longitude")
    private float longitude;

    public RestaurantAddress() {
    }

    public RestaurantAddress(int id, String city, int pincode, String place, float lattitude, float longitude) {
        this.id = id;
        this.city = city;
        this.pincode = pincode;
        this.place = place;
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getLattitude() {
        return lattitude;
    }

    public void setLattitude(float lattitude) {
        this.lattitude = lattitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
