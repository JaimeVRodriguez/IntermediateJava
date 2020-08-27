/*
 * Jaime Rodriguez
 * Assignment 1.1
 * August 18, 2020
 *
 * Purpose: Convert value of dollar amount given
 * to display denomination values
 *
 * To compile the program:
 * javac Dollars.java
 *
 * To execute the program:
 * java Dollars
 *
 */

import javax.swing.*;

public class Dollars {

    public static void main(String[] args) {

        // Initialize variables
        int dollarAmount, hundreds, fifties, twenties, tens, fives, ones;
        String userInput;


        // Prompt user to input a dollar amount and convert input to an integer
        userInput = JOptionPane.showInputDialog(null, "Please enter a dollar amount. Example: 180");
        dollarAmount = Integer.parseInt(userInput);

        // Find denomination values for each variable and adjust original dollar for ease of math
        hundreds = dollarAmount / 100;
        dollarAmount %= 100;

        fifties = dollarAmount / 50;
        dollarAmount %= 50;

        twenties = dollarAmount / 20;
        dollarAmount %= 20;

        tens = dollarAmount / 10;
        dollarAmount %= 10;

        fives = dollarAmount / 5;
        dollarAmount %= 5;

        ones = dollarAmount / 1;

        // Display original input amount followed by breakdown of denominations
        JOptionPane.showMessageDialog(null, "Dollar amount entered: " + userInput + "\n\n" +
                                                                    "---The denominations are below---" + "\n" +
                                                                    "100's: " + hundreds + "\n" +
                                                                    "50's:  " + fifties + "\n" +
                                                                    "20's:  " + twenties + "\n" +
                                                                    "10's:  " + tens + "\n" +
                                                                    "5's:   " + fives + "\n" +
                                                                    "1's:   " + ones);

        System.exit(0);
    }
}
