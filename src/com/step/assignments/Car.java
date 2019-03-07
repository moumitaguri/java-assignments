package com.step.assignments;

public class Car extends Vehicle {

    private String colour;
    private  int gears;

    public Car(String name, int speed, String colour, int gears) {
        super(name, speed, 4);
        this.colour = colour;
        this.gears = gears;
    }

    public void handSteer(){
        System.out.println("can hand steering");
    }

    public void changeGeer(){
        System.out.println("can change geer");
    }

    public String getColour() {
        return colour;
    }

    public int getGears() {
        return gears;
    }
}
