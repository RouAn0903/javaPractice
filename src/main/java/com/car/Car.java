package com.car;


import java.util.Calendar;
import java.util.Date;

public class Car {
    String id;
    Date enter;

    public Car(String id, String time){
        this.id = id;
        Calendar cl =Calendar.getInstance();
        String[] tokens = time.split(":");
        cl.set(Calendar.HOUR_OF_DAY, Integer.parseInt(tokens[0]));
        cl.set(Calendar.MINUTE, Integer.parseInt(tokens[1]));
        enter = cl.getTime();
    }
}

