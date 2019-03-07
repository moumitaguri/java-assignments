package com.step.assignments;

public class CircleCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.75);

        System.out.println("circle1 radius = " + circle1.getRadius());
        System.out.println(("circle1 area = " + circle1.getArea()));

        Circle circle2 = new Circle(-2);

        System.out.println("circle2 radius = " + circle2.getRadius());
        System.out.println(("circle2 area = " + circle2.getArea()));

        Cylinder cylinder1 = new Cylinder(5.55, 7.25);

        System.out.println("Cylinder1 radius = " + cylinder1.getRadius());
        System.out.println("Cylinder1 height = " + cylinder1.getHeight());
        System.out.println("Cylinder1 area = " + cylinder1.getArea());
        System.out.println("Cylinder1 volume = " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(2, -4);

        System.out.println("Cylinder2 radius = " + cylinder2.getRadius());
        System.out.println("Cylinder2 height = " + cylinder2.getHeight());
        System.out.println("Cylinder2 area = " + cylinder2.getArea());
        System.out.println("Cylinder2 volume = " + cylinder2.getVolume());
    }
}
