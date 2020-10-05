/*
 * Jaime Rodriguez
 * Assignment 8.2
 * October 5, 2020
 *
 * Purpose: Correct bug error in classmates
 * program to function properly
 *
 * To compile the program:
 * javac SwingControlDemo.java
 *
 * To execute the program:
 * java SwingControlDemo
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo {
    protected JFrame mainFrame;
    protected JLabel headerLabel;
    protected JLabel statusLabel;
    protected JPanel controlPanel;

    public SwingControlDemo(){
        prepareGUI();
    }

    public static void main(String[] args){
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        // Missing both parenthesis for method call
        // Added "()" to end of showButtonDemo
        swingControlDemo.showButtonDemo();
    }

    // Misspelled "public"
    public void prepareGUI(){
        mainFrame = new JFrame("Java Swing Examples");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {

            // Changed to public from private
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);
        controlPanel = new JPanel();
        // Missing closing parenthesis
        // Added "()" to end of FlowLayout
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    // Misspelled "public"
    public static ImageIcon createImageIcon(String path, String description) {
        java.net.URL imgURL = SwingControlDemo.class.getResource(path);

        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            // void was incorrect. replaced with "out"
            System.out.println("Couldn't find file: " + path);
            return null;
        }
    }

    private void showButtonDemo(){
        headerLabel.setText("Control in action: Button"); //resources folder should be inside SWING folder.
        ImageIcon icon = createImageIcon("/resources/java_icon.png","Java");
        JButton okButton = new JButton("OK");
        JButton javaButton = new JButton("Submit", icon);
        JButton cancelButton = new JButton("Cancel", icon);
        cancelButton.setHorizontalTextPosition(SwingConstants.LEFT);
        // Missing () for ActionListener call
        // Changed fom ... new ActionListener to ... new ActionListener()
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Ok Button clicked.");
            }
        });

        // Missing () for ActionListener call
        // Changed fom ... new ActionListener to ... new ActionListener()
        javaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Submit Button clicked.");
            }
        });

        // Missing () for ActionListener call
        // Changed fom ... new ActionListener to ... new ActionListener()
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Cancel Button clicked.");
            }
        // Missing closing parenthesis
        });

        controlPanel.add(okButton);
        controlPanel.add(javaButton);
        controlPanel.add(cancelButton);
        mainFrame.setVisible(true);
    }
}