/*
 * Jaime Rodriguez
 * Assignment 6.2
 * September 23, 2020
 *
 * Purpose: Correct bug error in classmates
 * program to function properly
 *
 * To compile the program:
 * javac Debug_wk6.java
 *
 * To execute the program:
 * java Debug_wk6
 *
 */

class Vehicle {

    protected String make = "Ferrari";

    public void engineRev() {

        System.out.println("Vroom! Vroom!");

    }

}

class Car extends Vehicle {

    private String model = "488 Spider";

    public static void main(String[] args) {

        Car myFastCar = new Car();

        // Did not match original method.
        myFastCar.engineRev();

        // type did not exists. Changed to make.
        System.out.println(myFastCar.make + " " + myFastCar.model);

    }

}