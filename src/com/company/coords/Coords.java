package com.company.coords;

public class Coords {
    private double x;
    private double y;

    public Coords(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    @Override
    public String toString() {
        return "(x= " + x +
                ", y= " + y +
                " )";
    }
}
