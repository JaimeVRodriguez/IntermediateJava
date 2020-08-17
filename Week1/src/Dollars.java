import javax.swing.*;

public class Dollars {

    public static void main(String[] args) {

        double dblInput = 0.0;
        int intInput = 0;
        int hundreds = 0;
        int fifties = 0;
        String rawInput;

        rawInput = JOptionPane.showInputDialog(null, "Please enter a dollar amount. Example: 33.44");
        dblInput = Double.parseDouble(rawInput);
        hundreds = (int)dblInput / 100;
        fifties = (int)dblInput % 100 / 50;
        JOptionPane.showMessageDialog(null, "The value entered is: " + dblInput + "\n" +
                                                                    "100's: " + hundreds + "\n" +
                                                                    "50's:  " + fifties);


    }
}
