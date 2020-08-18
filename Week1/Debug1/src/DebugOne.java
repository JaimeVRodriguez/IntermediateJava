/*
 * Jaime Rodriguez
 * Assignment 1.2
 * August 18, 2020
 *
 * Purpose: Purposely insert "bugs" for
 * other students to find and fix
 *
 * To compile the program:
 * javac DebugOne.java
 *
 * To execute the program:
 * java DebugOne
 *
 */

import javax.swing.*;

public class DebugOne {

    public static void main(String [] args) {

        String userInputOne, userInputTwo;
        int numberOne, numberTwo, total;

        JOptionPane.showMessageDialog(null, "Your two number will be added together.");
        // Missing "J"
        userInputOne = OptionPane.showInputDialog(null, "Enter your first a whole number");
        numberOne = Integer.parseInt(userInputOne);

        userInputTwo = JOptionPane.showInputDialog(null, "Enter your second number");
        // Missing ";"
        numberTwo = Integer.parseInt(userInputTwo)

        // userInputOne and userInput Two should be numberOne and numberTwo
        total = userInputOne + userInputTwo;

        JOptionPane.showMessageDialog(null, numberOne + " + " + numberTwo + " = " + total);

    }
}
