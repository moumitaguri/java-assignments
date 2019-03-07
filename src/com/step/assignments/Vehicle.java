package com.step.assignments;

public class Vehicle {
    private String name;
    private int speed;
    private int wheels;

    public Vehicle(String name, int speed, int wheels) {
        this.name = name;
        this.speed = speed;
        this.wheels = wheels;
    }

    public void move(){
        System.out.println("can move");
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWheels() {
        return wheels;
    }
}
