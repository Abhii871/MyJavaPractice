package com.Construstors;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("Distance (0,0)" + first.distance());
        System.out.println("Distance (second)=" + first.distance(3,1));
        System.out.println("Distance (2,2)=" + first.distance(2, 2));
        Point point = new Point();
        System.out.println("Distance ()= " + point.distance());

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double distance;
        int x2 = 0, y2 = 0;
        distance = Math.sqrt((x2 - getX()) * (x2 - getX()) + ((y2 - getY()) * (y2 - getY())));
        return distance;
    }

    public double distance(int x, int y) {
        double distance;
        distance = Math.sqrt((x - getX()) * (x - getX()) + ((y - getY()) * (y - getY())));
        return distance;
    }

    public double distance(double x, double y) {
        double distance;
        distance = Math.sqrt((x - getX()) * (x - getX()) + ((y - getY()) * (y - getY())));
        return distance;
    }

}
