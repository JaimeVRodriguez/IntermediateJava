/*
 * Jaime Rodriguez
 * Assignment 5.2
 * September 14, 2020
 *
 * Purpose: Purposely insert "bugs" for
 * other students to find and fix
 *
 * To compile the program:
 * javac DebugFive.java
 *
 * To execute the program:
 * java DebugFive
 *
 */

import java.util.Scanner;

class Employee {

    private String firstName, position;
    private int idNumber;

    public Employee(String firstName, String position, int idNumber) {
        this.firstName = firstName;
        this.position = position;
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", position='" + position + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

}

public class DebugFive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int numOfEmp = sc.nextInt();

        Employee [] employees = new Employee[numOfEmp];

        // No arrLength variable
        // change arrLength to employees.length or
        // int arrLength = employees.length
        for (int i = 0; i < arrLength; i++) {
            System.out.print("Enter employee first name: ");
            String firstName = sc.next();
            System.out.print("Enter employee position: ");
            String position = sc.next();
            System.out.print("Enter employee id number: ");
            int idNumber = sc.nextInt();

            // "id" should read idNumber
            Employee emp = new Employee(firstName, position, id);

            employees[i] = emp;
            System.out.println();
        }

        // This will only print memory location
        // Need to create a for loop and print employees[i]
        System.out.println(employees);
    }
}
