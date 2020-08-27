/*
 * Jaime Rodriguez
 * Assignment 1.2
 * August 18, 2020
 *
 * Purpose: Correct bug error in classmates
 * program to function properly
 *
 * To compile the program:
 * javac ErrorOne.java
 *
 * To execute the program:
 * java ErrorOne
 *
 */

import java.awt.Component;
import javax.swing.JOptionPane;

public class ErrorOne {

    public static void main(String[] args) {

        String inputstring;
        int age;
        // showInputDialog was missing null, started with a ","
        inputstring = JOptionPane.showInputDialog(null, "Enter Your age", "?????", JOptionPane.INFORMATION_MESSAGE);
        age = Integer.parseInt(inputstring);
        if (age <= 20) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "You are young.");
        }
        else
        {
            // frame had no value, added "null"
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "You are Old!.");
        }
    }
}
