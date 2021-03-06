package org.fasttrackit;

public class Vehicle {

    public static int vehicleCount;


    private String name;
    private String color;
    private double mileage;
    private double fuelLevel;
    private double totalTraveledDistance;



    public Vehicle() {
        vehicleCount++;
    }

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + "has accelerated with" + speed + "km/h for" + durationInHours + "hours.");

        double travelDistance = speed + durationInHours;

        System.out.println("Travel Distance" + travelDistance + "km");


//        totalTraveledDistance = totalTraveledDistance + travelDistance;
        totalTraveledDistance += travelDistance;
        System.out.println("Total Traveled Distance =" + totalTraveledDistance);

        double spentFuel = travelDistance * mileage / 100 ;
        fuelLevel -= spentFuel;
        System.out.println("Remaining fuel" + fuelLevel);

        fuelLevel++;


        return travelDistance;

    }

//example of method overloading
    public double accelerate(double speed) {

        return accelerate(speed, 1);



        }

        public String getName(){
            return name;

        }





    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}