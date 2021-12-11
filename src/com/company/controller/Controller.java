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

            if(data.isEmpty()) continue;
            String[] validatedData= Proxy.validateInput(data);

            Flyweight flyweight = flyweightFactory.getFlyweight(validatedData);

            boolean cont = true;
            do{
                System.out.println("Choose action:\n1 - show history\n2 - add coords\nelse - go back");

                switch (Integer.parseInt(scanner.nextLine())){
                    case 1:
                        System.out.println(flyweight);
                        break;
                    case 2:
                        System.out.println("x enter\ny enter");
                        double x = Double.parseDouble(scanner.nextLine());
                        double y = Double.parseDouble(scanner.nextLine());
                        flyweight.addCoords(x,y);
                        break;
                    default:
                        cont = false;
                        break;
                }
            }while(cont);
        }
    }
}
