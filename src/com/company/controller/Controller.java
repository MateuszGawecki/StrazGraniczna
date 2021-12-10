package com.company.controller;

import com.company.flyweight.Flyweight;
import com.company.flyweight.FlyweightFactory;
import com.company.proxy.Proxy;

import java.util.Scanner;

public class Controller {
    private final FlyweightFactory flyweightFactory;
    private final Scanner scanner;
    //private final Proxy proxy;

    public Controller() {
        this.flyweightFactory = new FlyweightFactory();
        this.scanner = new Scanner(System.in);
        //this.proxy = new Proxy();
    }

    public void menu(){

        for(;;){
            System.out.println("Give data: ");
            String data = scanner.nextLine();

            String[] validatedData= Proxy.validData(data);

            Flyweight flyweight = flyweightFactory.getFlyweight(validatedData);

            System.out.println(flyweight);
        }
    }
}
