package com.car;

import javafx.stage.StageStyle;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        Map<String, Car> cars = new HashMap<>();
        int fee=30;
        Car c1 = new Car("abc-123", "7:30");
        Car c2 = new Car("def-456", "9:45");
        Car c3 = new Car("ghi-789", "10:30");
        cars.put(c1.id, c1);
        cars.put(c2.id, c2);
        cars.put(c3.id, c3);
        String id ="abc-123";
        Car c = cars.get(id);
        if(c == null){
            System.out.println("Car no found");
        }else {
            Date d = new Date();
            long ms = d.getTime() - c.enter.getTime();
            int hr = (int) Math.ceil(ms/(1000*60*60));
            System.out.println(hr+" hr");
            System.out.println(hr*fee+" dollars");


        }

    }
}
