/*
 * Jaime Rodriguez
 * Assignment 6.1
 * September 22, 2020
 *
 * Purpose: Create program that prints
 * students objects in a a linked list
 * in both incremental and reverse order
 *
 * To compile the program:
 * javac Student.java
 *
 * To execute the program:
 * java Student
 *
 */

public class Student {

    private String firstName, lastName;
    private int studentID;

    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
