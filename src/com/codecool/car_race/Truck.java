package com.codecool.car_race;

import java.util.Random;

public class Truck extends Vehicle{

    Integer breakdownTurnsLeft;

    Truck() {
        name =  Integer.toString(new Random().nextInt(1001));
        breakdownTurnsLeft = 0;
    }


    @Override
    void prepareForLap(Race race) {
        speed = 100;
    }

    @Override
    void moveForAnHour() {
        if (breakdownTurnsLeft > 0) {
            breakdownTurnsLeft--;
        } else {
            if (new Random().nextInt(20) < 2) {
                breakdownTurnsLeft = 2;
            } else {
                distanceTraveled += speed;
            }
        }
    }
}
