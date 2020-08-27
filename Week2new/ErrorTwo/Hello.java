/*
 * Jaime Rodriguez
 * Assignment 2.3
 * August 27, 2020
 *
 * Purpose: Correct bug error in classmates
 * program to function properly
 *
 * To compile the program:
 * javac Hello.java
 *
 * To execute the program:
 * java Hello
 *
 */

// Removed the package as it would not run with the package
public class Hello {   

    String name;           
          
    // Needed to math class, Changed from "hello" to "Hello"
    Hello() {        
        this.name = "example of constructors";           
    }     

    public static void main(String[] args) {   

        // Had a ] in stead of )
        // "string" is the name of the variable type. Changed it to "stringOne"
        Hello stringOne = new Hello();             

        System.out.println(stringOne.name);
    }
};