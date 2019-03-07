package com.step.assignments;

public class PointMain {

    public static void main(String[] args) {

        Point point1 = new Point(6, 5);
        Point point2 = new Point(3, 1);

        System.out.println("distance(0,0) = " + point1.distance());
        System.out.println("distance(point2) = " + point1.distance(point2));
        System.out.println("distance(2,2) = " + point1.distance(2,2));

        Point point3 = new Point();

        System.out.println("distance = " + point3.distance());

    }
}
