package org.fasttrackit;

public class Vehicle {

    public static int vehicleCount;


    private String name;
    private String color;
    private double mileage;

    public Vehicle() {
        vehicleCount++;
    }

    protected double accelerate(double speed, double durationInHours) {
        System.out.println(name + "has accelerated with" + speed + "km/h for" + durationInHours + "hours.")


    }
}