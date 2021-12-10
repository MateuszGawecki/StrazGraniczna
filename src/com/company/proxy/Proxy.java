package com.company.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Proxy {
    public static String[] validData(String d) {

        System.out.println(d);
        List<String> list = new ArrayList<>();

        String[] data = d.split(" ");

        for (int i = 0; i < data.length; i++) {
            data[i] = data[i].trim();
            if (!data[i].isBlank()) list.add(data[i]);
        }

        return list.toArray(new String[0]);
    }
}
