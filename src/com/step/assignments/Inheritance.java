package com.step.assignments;

public class Inheritance {

    public static void main(String[] args) {

        Car car = new Car("Audi",120,"Black",3 );

        System.out.println("car name = " + car.getName());
        System.out.println("car speed = " + car.getSpeed());
        System.out.println("No. of wheels = " + car.getWheels());
        System.out.println("car colour = " + car.getColour());
        System.out.println("No. of geers= " + car.getGears());

        car.move();
        car.handSteer();
        car.changeGeer();
    }
}
