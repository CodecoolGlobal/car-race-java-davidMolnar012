package com.codecool.car_race;

import java.util.Random;

public class Car extends Vehicle{
    String[] nameList = {"Liberty", "Supremacy", "Virtue", "Vagabond", "Bullet", "Mammoth", "Evolution", "Icon",
            "Crest", "Bliss"};
    Integer speedLimit;
    Car() {
        name = nameList[new Random().nextInt(10)] + " " + nameList[new Random().nextInt(10)];
        distanceTraveled = 0;
        speed = 80 + new Random().nextInt(31);
        speedLimit = null;
    }

    @Override
    void prepareForLap(Race race) {
        if (race.isThereABrokenTruck()) {
            speedLimit = 75;
        } else {
            speedLimit = null;
        }
    }

    @Override
    void moveForAnHour() {
        if (speedLimit != null) {
            distanceTraveled += speedLimit;
        } else {
            distanceTraveled += speed;
        }
    }
}
