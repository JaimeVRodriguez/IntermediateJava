/*
 * Jaime Rodriguez
 * Assignment 3.3
 * August 31, 2020
 *
 * Purpose: Purposely insert "bugs" for
 * other students to find and fix
 *
 * To compile the program:
 * javac DebugThree.java
 *
 * To execute the program:
 * java DebugThree
 *
 */

import java.util.Scanner;

class Phone {

    // And is invalid. Should be ","
    String make and model and size;

    public String toString() {
        return "Make: " + make + "\n" +
                "Model: " + model + "\n" +
                "Size: " + size;
    }
}

public class DebugThree {

    public static void main(String[] args) {

        // Missing .in
        Scanner sc = new Scanner(System);

        System.out.println("Enter the info for your phone");
        System.out.print("Enter the make: ");
        String make = sc.nextLine();
        System.out.print("Enter the model: ");
        String model = sc.nextLine();
        System.out.print("Enter the number of size in GB: ");
        // Wrong scanner type. Should be sc.nextLine()
        String size = sc.nextInt();

        Phone phoneOne = new Phone();

        phoneOne.make = make;
        phoneOne.model = model;
        phoneOne.size = size;

        System.out.println();
        System.out.println(phoneOne);
    }
}
