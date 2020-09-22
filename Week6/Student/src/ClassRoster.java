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
 * javac ClassRoster.java
 *
 * To execute the program:
 * java ClassRoster
 *
 */

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ClassRoster {

    public static void main(String[] args) {

        List<Student> students = new LinkedList<Student>();

        // Place 20 unique "students" into linked list
        students.add(new Student("Jaime", "Rodriguez", 101));
        students.add(new Student("Kennedy", "Rose", 102));
        students.add(new Student("Kara", "Garcia", 103));
        students.add(new Student("Dylan", "Garcia", 104));
        students.add(new Student("Gunner", "Rodriguez", 105));
        students.add(new Student("Krystal", "Rodriguez", 106));
        students.add(new Student("Cody", "Sawhill", 107));
        students.add(new Student("Felipe", "Carillo", 108));
        students.add(new Student("Sarah", "Carillo", 109));
        students.add(new Student("Jerry", "Hernandez", 110));
        students.add(new Student("Adrian", "Rodriguez", 111));
        students.add(new Student("Mike", "Walsh", 112));
        students.add(new Student("Adam", "Camp", 113));
        students.add(new Student("Steve", "Knitter", 114));
        students.add(new Student("Alex", "Bollinger", 115));
        students.add(new Student("Jimmy", "Stanley", 116));
        students.add(new Student("Clair", "Lawerence", 117));
        students.add(new Student("Eva", "Rodriguez", 118));
        students.add(new Student("Doug", "Duke", 119));
        students.add(new Student("Eric", "Moreno", 120));

        // Print items in linked list in order in which they were placed using "ListIterator"
        System.out.println("=== Incremental Order ===");
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("ID Number: " + student.getStudentID() + " First Name: " + student.getFirstName() + " Last Name: "+ student.getLastName());
        }

        System.out.println();

        // Print items in linked list in reversed order using "ListIterator"
        System.out.println("=== Reverse Order ===");
        ListIterator<Student> reverseIterator = students.listIterator(students.size());
        while (reverseIterator.hasPrevious()) {
            Student student = reverseIterator.previous();
            System.out.println("ID Number: " + student.getStudentID() + " First Name: " + student.getFirstName() + " Last Name: "+ student.getLastName());
        }
    }
}
