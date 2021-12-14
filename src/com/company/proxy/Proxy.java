package com.company.proxy;

import java.util.ArrayList;
import java.util.List;

public abstract class Proxy {
    public static String[] validateNames(String d) {

        List<String> list = new ArrayList<>();

        String[] data = d.split(" ");

        for (int i = 0; i < data.length; i++) {
            if (!data[i].isBlank()) {
                data[i] = data[i].trim();
                data[i] = data[i].substring(0,1).toUpperCase() + data[i].substring(1).toLowerCase();
                list.add(data[i]);
            }
        }

        return list.toArray(new String[0]);
    }

    public static double[] validateCoords(String d){
        d = d.replace(",",".");
        String[] data = d.split(" ");

        double[] cords = new double[2];

        cords[0] = Double.parseDouble(data[0]);
        cords[1] = Double.parseDouble(data[1]);

        return cords;
    }
}
