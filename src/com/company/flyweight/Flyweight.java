package com.company.flyweight;

import com.company.coords.Coords;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Flyweight extends FlyweightFactory{
    private final String givenName;
    private final List<Coords> coords;

    public Flyweight(String givenName) {
        this.givenName = givenName;
        this.collection = new ArrayList<>();
        this.coords = new ArrayList<>();
    }

    public void addCoords(double x, double y){
        this.coords.add(new Coords(x,y));
    }

    @Override
    public String toString() {
        return "\ncoords=" + coords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flyweight flyweight = (Flyweight) o;
        return Objects.equals(givenName, flyweight.givenName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(givenName);
    }
}
