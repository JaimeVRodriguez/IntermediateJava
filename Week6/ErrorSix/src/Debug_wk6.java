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

import java.util.*;

public class Debug_wk6 {

    public static void main(String[] args) {

        // Missing "Hash" in construction of HashMap
        // Value types were reversed
        HashMap<Integer, String> zipCodes = new HashMap<>();

        zipCodes.put(90210, "Beverly Hills");
        zipCodes.put(68005, "Bellevue");
        zipCodes.put(73301, "Austin");
        zipCodes.put(10001, "New York");

        zipCodes.forEach((key,value) -> System.out.println(key + " = " + value));

        System.out.println("\nThere are " + zipCodes.size() + " Key-Value Pairs "+
                "Lets add your zip code and city. \n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your zip code: ");
        int zip = scan.nextInt();

        // Changed to next. nextLine was skipping the input option for city.
        System.out.println("Enter your City: ");
        String city = scan.next();

        // "put" was mispelled. has 'q' instead of 'p'
        zipCodes.put(zip,city);

        zipCodes.forEach((key,value) -> System.out.println(key + " = " + value)); //Print again

    }
}
  