/*
 * Jaime Rodriguez
 * Assignment 8.2
 * October 5, 2020
 *
 * Purpose: Purposely insert "bugs" for
 * other students to find and fix
 *
 * To compile the program:
 * javac NameDisplay.java
 *
 * To execute the program:
 * java NameDisplay
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JHelloFrame extends JFrame implements ActionListener {

    JLabel question = new JLabel("What is your name");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    JTextField answer = new JTextField(10);
    JButton pressMe = new JButton("Press Me");
    JLabel greeting = new JLabel("");
    final int WIDTH = 275;
    final int HEIGHT = 225;

    public JHelloFrame() {
        super("Hello Frame");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        question.setFont(bigFont);
        greeting.setFont(bigFont);
        add(question);
        add(answer);
        add(pressMe);
        add(greeting);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Wrong name called
        // Should read pressMe.addActionListener(this)
        button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String name = answer.getText();
        String greet = "Hello, " + name;
        greeting.setText(greet);
    }

}
public class NameDisplay {

    public static void main(String[] args) {
        // Missing "()" for JHelloFrame Class call.
        // Should read .... = new JHelloFrame();
        JHelloFrame frame = new JHelloFrame;
        frame.setVisible(true);
    }
}
