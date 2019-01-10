package org.fasttrackit.cheater;

import org.fasttrackit.Vehicle;

public class UFO extends Vehicle{

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println("Accelerating as UFO");
        System.out.println(getName() + "has accelerated with" + speed + "km/h for" + durationInHours + "hours.");

        double travelDistance = 2 * speed + durationInHours;

        System.out.println("Travel Distance" + travelDistance + "km");
        return travelDistance;
    }

    public void concealCheating(){
        System.out.println("i;m not cheating");

    }
    //example of co-variant return type
    //example of extending acces prieleges in overriden method


}
