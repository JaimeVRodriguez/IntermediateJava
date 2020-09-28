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

public class UseDivision {

    public static void main(String[] args) {

        // Create array in order to iterate through and print display() later
        Object[] divisionArray = new Object[4];

        // Create 2 instances of each subclass (4 total)
        InternationalDivision divisionOne = new InternationalDivision("Sales", 991245, "Moldova", "Romanian");
        InternationalDivision divisionTwo = new InternationalDivision("Engineering", 921873, "Philippines", "Tagalog");
        DomesticDivision divisionThree = new DomesticDivision("Marketing", 982109, "Washington");
        DomesticDivision divisionFour = new DomesticDivision("Human Resources", 872019, "North Carolina");

        // Add instances to array for printing purposes
        divisionArray[0] = divisionOne.display();
        divisionArray[1] = divisionTwo.display();
        divisionArray[2] = divisionThree.display();
        divisionArray[3] = divisionFour.display();


        // Print all instances
        System.out.println("==== Company XYZ Divisions ====");

        for (Object division : divisionArray) {
            System.out.println(division);
            System.out.println();
        }


    }
}
