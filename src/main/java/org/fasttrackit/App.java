package org.fasttrackit;

import org.fasttrackit.cheater.UFO;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    Engine engine = new Engine();
    engine.manufacturer = "Renalut";
    engine.capacity = 1500;

    Car car = new  Car();
      car.name = "Dacia";
      car.color = "white";
      car.doorCount = 4;
      car.mileage = 7.5;
      car.running = true;
//
//      Engine engine = new Engine();
//      engine.manufacturer = "Renault";
//      engine.capacity = 1500;
//
//      car.engine = engine;
//
//      car.engine.manufacturer = "BMW";
//      engine.manufacturer = "Microsoft";
//
//      engine = null;
//
//      Car car2 = new Car();
//      car2.name = "sfa";


        //Example of static variables unique for the whole application

        Vehicle vehicle1 = new Vehicle();
        vehicle1.vehicleCount++;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.vehicleCount = 2;

        Vehicle.vehicleCount = 3;


        System.out.println("Value from vehicle 1:" + vehicle1.vehicleCount);
        System.out.println("Value from vehicle 2:" + vehicle2.vehicleCount);
        System.out.println("Value from Vehicle class:" + Vehicle.vehicleCount);

        System.out.println();

        new AutoVehicle();

        new AutoVehicle(new Engine());

        //example of invoking overloaded methods
        vehicle1.accelerate(34.12);
        vehicle2.accelerate(100, 2);

        new UFO().accelerate(100, 2);

        System.out.println(car);

        //Polymorphism (an object can take multiple forms)
        Vehicle ufo = new UFO();
        //The type of the variable does Not determine the object's behaviour
        ufo.accelerate(200, 2 );

        //The type of the variable determines what methods can be invoked
        //We might need type casting (see below)
        ((UFO) ufo).concealCheating();





    }
}
