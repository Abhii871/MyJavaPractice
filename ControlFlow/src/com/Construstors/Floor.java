package com.Construstors;

public class Floor {

    private double width;
    private double length;
    private double area;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }
    }
    public double getArea() {
        area = length * width;
        return area;
    }

}

class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            cost = 0;
        }
        else {
            this.cost=cost;
        }
    }
    public double getCost() {
        return cost;
    }
}

class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double totalCost =  carpet.getCost() *floor.getArea();
        return totalCost;
    }
}