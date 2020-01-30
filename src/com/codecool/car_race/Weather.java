package com.codecool.car_race;
import java.util.Random;

public class Weather {
    boolean rain;

    public void setRaining() {
           if (new Random().nextInt(10) + 1 <= 3) {
               rain = true;
           } else {
               rain = false;
           }
    }

    public boolean isRaining() {
        return rain;
    }
}
