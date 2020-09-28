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

public class InternationalDivision extends Division {

    private String country, language;

    // Constructor with new country and language attributes
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    // Modify abstract display method
    public String display() {
        return "Division: " + getDivisionName() + "\n" +
                "Account Number: " + getAccountNumber() + "\n" +
                "Country: " + country + "\n" +
                "Language: " + language;
    }
}
