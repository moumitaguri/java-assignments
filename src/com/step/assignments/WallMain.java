package com.step.assignments;

public class WallMain {

    public static void main(String[] args) {

        Wall wall1 = new Wall();

        wall1.setHeight(-1.5);
        wall1.setWidth(-1.5);

        System.out.println("wall1 height " + wall1.getHeight());
        System.out.println("wall1 width " + wall1.getWidth());
        System.out.println("wall1 area " + wall1.getArea());

        wall1.setWidth(5);
        wall1.setHeight(4);

        System.out.println("wall1 height " + wall1.getHeight());
        System.out.println("wall1 width " + wall1.getWidth());
        System.out.println("wall1 area " + wall1.getArea());

        Wall wall2 = new Wall(-1.5, -1.5);

        System.out.println("wall2 height " + wall2.getHeight());
        System.out.println("wall2 width " + wall2.getWidth());
        System.out.println("wall2 area " + wall2.getArea());

        Wall wall3 = new Wall(5, 4);

        System.out.println("wall3 height " + wall3.getHeight());
        System.out.println("wall3 width " + wall3.getWidth());
        System.out.println("wall3 area " + wall3.getArea());

    }
}
