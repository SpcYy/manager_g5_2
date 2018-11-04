package com.bean;

import java.util.Date;

public class CarReserve {
    private Integer id;

    private String carNumber;

    private Date startTime;

    private Date endTime;

    private String destination;

    private Integer mileage;

    private String userCar;

    private Integer shengpiPeople;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getUserCar() {
        return userCar;
    }

    public void setUserCar(String userCar) {
        this.userCar = userCar == null ? null : userCar.trim();
    }

    public Integer getShengpiPeople() {
        return shengpiPeople;
    }

    public void setShengpiPeople(Integer shengpiPeople) {
        this.shengpiPeople = shengpiPeople;
    }
}