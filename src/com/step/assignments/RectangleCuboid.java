package com.step.assignments;

public class RectangleCuboid {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 10);

        System.out.println("Rectangle1 width = " + rectangle1.getWidth());
        System.out.println("Rectangle1 length = " + rectangle1.getLength());
        System.out.println("Rectangle1 area = " + rectangle1.getArea());

        Cuboid cuboid1 = new Cuboid(5, 10, 5);

        System.out.println("Cuboid1 width = " + cuboid1.getWidth());
        System.out.println("Cuboid1 length = " + cuboid1.getLength());
        System.out.println("Cuboid1 area = " + cuboid1.getArea());
        System.out.println("Cuboid1 volume = " + cuboid1.getVolume());


    }
}
