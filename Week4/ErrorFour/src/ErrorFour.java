/*
 * Jaime Rodriguez
 * Assignment 4.2
 * September 9, 2020
 *
 * Purpose: Correct bug error in classmates
 * program to function properly
 *
 * To compile the program:
 * javac ErrorFour.java
 *
 * To execute the program:
 * java ErrorFour
 *
 */

import javax.swing.*;

public class ErrorFour {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String name;
        String inputAge;
        int age;

        // Removed initial question from do loop
        // Removed do loop
        name = JOptionPane.showInputDialog(null, "Please enter your name: ");

        inputAge = JOptionPane.showInputDialog(null, "Please enter your age: ");

        // Left while loop to run if no numbers were fount in age
        while(!inputAge.matches(".*[1234567890].*")) {
                JOptionPane.showMessageDialog(null, "You didn't enter a proper age.");
                inputAge = JOptionPane.showInputDialog(null, "Please enter your age: ");
        }

        age = Integer.parseInt(inputAge);

        // Removed if state to run another while loop
        // Run while loop to verify age above 18
        // Show confirmation once age is appropriate
        while(age < 18) {
                inputAge = JOptionPane.showInputDialog(null, "Sorry, not an appropriate age. Try again.");
                age = Integer.parseInt(inputAge);
        }

        JOptionPane.showMessageDialog(null, "Hello, " + name + ".\n Your age is approved at: " + age);
    }
}