/*
 * Jaime Rodriguez
 * Assignment 7.2
 * September 28, 2020
 *
 * Purpose: Purposely insert "bugs" for
 * other students to find and fix
 *
 * To compile the program:
 * javac DebugSeven.java
 *
 * To execute the program:
 * java DebugSeven
 *
 */

abstract class Dog {

    String breed;

    public Dog(String breed) {
        this.breed = breed;
    }
}
// Incorrect extension. Should read "extends"
class Pitbull extension of Dog {

    String color;

    public Pitbull(String breed, String color) {
        // Unneeded "class". Should read super(breed)
        super class(breed);
        this.color = color;
    }

    public String toString() {
        return "Pitbull{" +
                "color='" + color + '\'' +
                '}';
    }
}
public class DebugSeven {

    public static void main(String[] args) {
        // Called wrong class. Should read "Pitbull chloe..."
        Dog chloe = new Pitbull("Pitbull", "Brindle");

        System.out.println(chloe);
    }
}
