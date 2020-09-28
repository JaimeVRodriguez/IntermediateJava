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

abstract class Division {

    private String divisionName;
    private int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public abstract String display();
}
