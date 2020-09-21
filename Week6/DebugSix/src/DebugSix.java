/*
 * Jaime Rodriguez
 * Assignment 6.2
 * September 21, 2020
 *
 * Purpose: Purposely insert "bugs" for
 * other students to find and fix
 *
 * To compile the program:
 * javac DebugSix.java
 *
 * To execute the program:
 * java DebugSix
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DebugSix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<String>();

        System.out.println("Enter your 3 favorite foods:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Food Item " + (i+1) + ": ");
            // Should read sc.next()
            String input = scanner.next();
            // Invalid method, should be foods.add()
            foods.insert(input);
        }

        System.out.println();
        System.out.println("=== Favorite Food List ===");
        for (int i =0; i < foods.size(); i++) {
            // Invalid method, should be foods.get()
            System.out.println(foods.item(i));
        }
    }
}
