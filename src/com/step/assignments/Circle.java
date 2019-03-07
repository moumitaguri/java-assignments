package com.step.assignments;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }



    public double getRadius() {
        if(radius < 0){
            return 0;
        }
        return radius;
    }

    public  double getArea(){
        return Math.PI * getRadius() * getRadius();
    }
}

