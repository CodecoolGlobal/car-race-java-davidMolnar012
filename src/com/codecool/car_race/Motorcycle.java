package com.codecool.car_race;

import java.util.Random;

public class Motorcycle extends Vehicle{
    static Integer nameCounter = 1;

    Motorcycle() {
        name = "Motorcycle " + nameCounter;
        nameCounter++;
    }

    @Override
    void prepareForLap(Race race) {
        if (race.weather.rain) {
            speed = new Random().nextInt(45) + 5;
        } else {
            speed = 100;
        }
    }


}
