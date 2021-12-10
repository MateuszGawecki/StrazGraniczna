package com.company.flyweight;

import com.company.coords.Coords;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Flyweight extends FlyweightFactory{
    private final String givenName;
    private List<Coords> coords;

    public Flyweight(String givenName) {
        this.givenName = givenName;
        this.collection = new ArrayList<>();
        this.coords = new ArrayList<>();
    }

    private void addCoords(double x, double y){
        this.coords.add(new Coords(x,y));
    }

    public Flyweight getFlyweight(String[] args){
        //TODO zwrócić referencię do Flyweight o podanym stringu a jeśli nie istnieje utworzyć i dodać

        return getFlyweight(args, collection);

    }

    @Override
    public String toString() {
        return "Flyweight{" +
                "givenName='" + givenName + '\'' +
                ", coords=" + coords +
                '}';
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
