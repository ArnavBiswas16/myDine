package com.foodDelivery.restaurant.service.dto;

import javax.persistence.*;
import java.time.LocalTime;

public class RestaurantDto {


        private String name;

        private String cuisine;

        private LocalTime operationStartTime;

        private LocalTime operationEndTime;

        private int isOpen;

        private int fkAddressId;

        private long phone;


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
