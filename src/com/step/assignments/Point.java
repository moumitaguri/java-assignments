package com.step.assignments;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0,0);
    }

    public double distance(int x, int y){

        Point p = new Point(x, y);
        return getDistance(this,p);
    }

    public double distance (Point anotherPoint){

        return getDistance(this,anotherPoint);

    }

    public double getDistance(Point p1, Point p2){

        return Math.sqrt( (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

}
