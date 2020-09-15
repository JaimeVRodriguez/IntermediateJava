/*
 * Jaime Rodriguez
 * Assignment 5.2
 * September 15, 2020
 *
 * Purpose: Correct bug error in classmates
 * program to function properly
 *
 * To compile the program:
 * javac Strings.java
 *
 * To execute the program:
 * java Strings
 *
 */

public class Strings {
    public static void main(String args[]) {
        String array[] = {"Hello,everyone", "How are you today?", "This cannot be an int", "7"};
        // Correct misspelling of array name
        for (String i : array) {
            System.out.println(i);
        }
    }
}