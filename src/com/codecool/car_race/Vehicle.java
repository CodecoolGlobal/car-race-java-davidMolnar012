package com.codecool.car_race;

public abstract class Vehicle {
    String name;
    Integer distanceTraveled = 0;
    Integer speed = 0;

    abstract void prepareForLap(Race race);

    void moveForAnHour() {
        distanceTraveled += speed;
    }

}
