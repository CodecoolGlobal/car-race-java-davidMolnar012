package com.codecool.car_race;

import java.util.ArrayList;

public class Race {
    Weather weather;
    boolean anyTruckBroken;
    ArrayList<Car> cars = new ArrayList<>(0);
    ArrayList<Motorcycle> motorcycles = new ArrayList<>(0);
    ArrayList<Truck> trucks = new ArrayList<>(0);

    Race() {
        weather = new Weather();
    }

    public void simulateRace() {
        weather.setRaining();
        for (int i = 0; i < 50; i++) {
            for (Car car: cars) {
                car.prepareForLap(this);
                car.moveForAnHour();
            }
            for (Motorcycle motorcycle: motorcycles) {
                motorcycle.prepareForLap(this);
                motorcycle.moveForAnHour();
            }
            anyTruckBroken = false;
            for (Truck truck : trucks) {
                truck.prepareForLap(this);
                truck.moveForAnHour();
                if (truck.breakdownTurnsLeft > 0) {
                    anyTruckBroken = true;
                }
            }
        }
    }

    public void printRaceResults() {
        for (Car car :
                cars) {
            System.out.println(car.name + " distance traveled: " + car.distanceTraveled);
        }
        for (Motorcycle motorcycle :
                motorcycles) {
            System.out.println(motorcycle.name + " distance traveled: " + motorcycle.distanceTraveled);
        }
        for (Truck truck :
                trucks) {
            System.out.println(truck.name + " distance traveled: " + truck.distanceTraveled);
        }
    }

    public boolean isThereABrokenTruck() {
        return anyTruckBroken;
    }
}
