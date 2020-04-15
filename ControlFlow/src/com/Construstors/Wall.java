package com.Construstors;

public class Wall {

    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    public static void main(String[] args) {
        Wall area1 = new Wall();
        Wall area2 = new Wall(89.9, -1.0);
        System.out.println(area2.width);
        System.out.println(area2.getArea());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        double area = getHeight() * getWidth();
        return area;
    }
}
