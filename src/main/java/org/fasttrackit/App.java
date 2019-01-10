package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//    Car car = new  Car();
//      car.name = "Dacia";
//      car.color = "white";
//      car.doorCount = 4;
//      car.mileage = 7.5;
//      car.running = true;
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


    }
}
