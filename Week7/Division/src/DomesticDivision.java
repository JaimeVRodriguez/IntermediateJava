/*
 * Jaime Rodriguez
 * Assignment 7.1
 * September 28, 2020
 *
 * Purpose: Utilize inheritance
 * in order to create subclasses
 * of the Division superclass
 *
 * To compile the program:
 * javac Division.java
 *
 * To execute the program:
 * java Division
 *
 */

public class DomesticDivision extends Division {

    private String state;

    // Constructor with new state attribute
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Modify abstract display method
    public String display() {
        return "Division: " + getDivisionName() + "\n" +
                "Account Number: " + getAccountNumber() + "\n" +
                "State: " + state;
    }
}
