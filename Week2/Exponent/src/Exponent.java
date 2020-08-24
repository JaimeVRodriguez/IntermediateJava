import javax.swing.*;

public class Exponent {

    public static void main (String [] args) {

        String userInput;
        double squareAnswer, cubeAnswer;

        userInput = JOptionPane.showInputDialog(null, "Enter your number: ");

        squareAnswer = square(userInput);
        cubeAnswer = cube(userInput);

        JOptionPane.showMessageDialog(null,"Number entered: " + userInput + "\n\n" +
                                                                    "Number squared: " + squareAnswer);

        JOptionPane.showMessageDialog(null,"Number entered: " + userInput + "\n\n" +
                                                                    "Number cubed: " + cubeAnswer);
    }

    public static double square(String input) {

        double square, number;
        number = Double.parseDouble(input);
        square = Math.pow(number, 2);

        return square;
    }

    public static double cube(String input) {

        double cube, number;
        number = Double.parseDouble(input);
        cube = Math.pow(number, 3);

        return cube;
    }
}
