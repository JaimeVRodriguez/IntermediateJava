/*
 * Jaime Rodriguez
 * Assignment 2.2
 * August 25, 2020
 *
 * Purpose: Create a class to collect info
 * about college enrollment. Create two instances
 * of college students
 *
 * To compile the program:
 * javac TestCollegeStudent.java
 *
 * To execute the program:
 * java TestCollegeStudent
 *
 */

import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCollegeStudent {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of CollegeStudent object
        CollegeStudent arr[] = new CollegeStudent[2];

        // For loop with the length of the CollegeStudent array to ask for the required information
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Student " + (i+1) + " First Name: ");
            String firstName = sc.next();
            System.out.println("Student " + (i+1) + " Last Name: ");
            String lastName = sc.next();
            System.out.println("Student " + (i+1) + " Enrollment Year (EX: 2020): ");
            int year = sc.nextInt();
            System.out.println("Student " + (i+1) + " Enrollment Month (EX: 8): ");
            int month = sc.nextInt();
            System.out.println("Student " + (i+1) + " Enrollment Day (EX: 19): ");
            int day = sc.nextInt();

            // Create date for the enrollmentDate parameter
            GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
            // Create object
            CollegeStudent st = new CollegeStudent(firstName, lastName, cal);

            // Each element of array is a new instance of CollegeStudent
            arr[i] = st;

            System.out.println();
        }

        // Print out each instance of a student to display appropriate information
        System.out.println("Student Info");
        System.out.println("============");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
