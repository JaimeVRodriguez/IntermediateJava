/*
 * Jaime Rodriguez
 * Assignment 2.1
 * August 24, 2020
 *
 * Purpose: Utilizing non-static methods
 * take a user input and square/cube number.
 * Show result in dialog box.
 *
 * To compile the program:
 * javac Exponent.java
 *
 * To execute the program:
 * java Exponent
 *
 */

import javax.swing.*;

public class Exponent {

    public static void main (String [] args) {

        String userInput;
        double number, squareAnswer, cubeAnswer;

        Exponent squared = new Exponent();
        Exponent cubed = new Exponent();

        userInput = JOptionPane.showInputDialog(null, "Enter your number: ");
        number = Double.parseDouble(userInput);

        squareAnswer = squared.squareMethod(number);
        cubeAnswer = cubed.cubeMethod(number);

        JOptionPane.showMessageDialog(null,"Number entered: " + userInput + "\n\n" +
                "Number squared: " + squareAnswer);
        JOptionPane.showMessageDialog(null,"Number entered: " + userInput + "\n\n" +
                "Number cubed: " + cubeAnswer);
    }

    public double squareMethod(double number) {
        double square;
        square = Math.pow(number, 2);

        return square;
    }

    public double cubeMethod(double number) {
        double cube;
        cube = Math.pow(number, 3);

        return cube;
    }
}
