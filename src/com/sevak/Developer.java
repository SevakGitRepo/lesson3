package com.sevak;

public class Developer {

    private String name;
    private String surName;
    private byte age;
    private Car car;

    //function
    public void changeColorCar( String color){
        if(car!=null){
            this.car.setColor(color);
        }else {
            System.out.println("! this developer does not have a car");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
