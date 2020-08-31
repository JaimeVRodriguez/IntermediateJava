/*
 * Jaime Rodriguez
 * Assignment 3.3
 * August 31, 2020
 *
 * Purpose: Correct bug error in classmates
 * program to function properly
 *
 * To compile the program:
 * javac Demo.java
 *
 * To execute the program:
 * java Demo
 *
 */

// Imported incorrectly, missing util
import java.util.Random;

public class Demo {

    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println("Random numbers...");

        // For loop never ran with i > 10 switch to i < 10
        for (int i = 1; i < 10; i++) {

            // Removed interior parenthesis
            int resRandom = rand.nextInt(9999 - 100 + 1) + 10;

            // Wrong variable was present
            System.out.println(resRandom);
        }
    }
} 