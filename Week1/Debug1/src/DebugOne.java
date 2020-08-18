import javax.swing.*;

public class DebugOne {

    public static void main(String [] args) {

        String userInputOne, userInputTwo;
        int numberOne, numberTwo, total;

        JOptionPane.showMessageDialog(null, "Your two number will be added together.");
        userInputOne = OptionPane.showInputDialog(null, "Enter your first a whole number");
        numberOne = Integer.parseInt(userInputOne);

        userInputTwo = JOptionPane.showInputDialog(null, "Enter your second number");
        numberTwo = Integer.parseInt(userInputTwo)

        total = userInputOne + userInputTwo;

        JOptionPane.showMessageDialog(null, numberOne + " + " + numberTwo + " = " + total);

    }
}
