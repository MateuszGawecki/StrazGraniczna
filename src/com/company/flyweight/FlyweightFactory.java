package com.company.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlyweightFactory {
    protected List<Flyweight> collection;

    public FlyweightFactory() {
        this.collection = new ArrayList<>();
    }

    public Flyweight getFlyweight(String[] args){
        //TODO zwrócić referencię do Flyweight o podanym stringu a jeśli nie istnieje utworzyć i dodać
        Flyweight flyweight = new Flyweight(args[0]);

        System.out.print(flyweight.getGivenName()+ " ");

        if(collection.contains(flyweight)){
            Flyweight existingFlyweight = collection.get(collection.lastIndexOf(flyweight));

            if(Arrays.copyOfRange(args, 1, args.length).length == 0){
                return existingFlyweight;
            }
            return existingFlyweight.getFlyweight(Arrays.copyOfRange(args, 1, args.length)); // przekazuje tablice bez pierwszego elementu
        }

        collection.add(flyweight);

        if(Arrays.copyOfRange(args, 1, args.length).length == 0){
            return flyweight;
        }

        return flyweight.getFlyweight(Arrays.copyOfRange(args, 1, args.length));
    }
}


/*
for(Flyweight flyweight : collection){
    if(flyweight.getGivenName().equals(args[0])){
        return flyweight.getFlyweight(Arrays.copyOfRange(args, 1, args.length));
    }
}

Flyweight flyweight = new Flyweight(args[0]);
collection.add(flyweight);
return flyweight.getFlyweight(Arrays.copyOfRange(args, 1, args.length));
 */