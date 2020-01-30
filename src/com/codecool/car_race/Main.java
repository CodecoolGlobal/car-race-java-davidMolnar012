package com.codecool.car_race;


import java.util.*;

import com.codecool.car_race.*;
public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        race.cars.addAll( new ArrayList<Car>(){{add(new Car());}});
        race.motorcycles.addAll( new ArrayList<Motorcycle>(){{add(new Motorcycle());}});
        race.trucks.addAll( new ArrayList<Truck>(){{add(new Truck());}});
    }
    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);

        race.simulateRace();
        race.printRaceResults();
    }
}
