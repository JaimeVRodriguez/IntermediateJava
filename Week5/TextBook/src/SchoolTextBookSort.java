/*
 * Jaime Rodriguez
 * Assignment 5.1
 * September 14, 2020
 *
 * Purpose: Create a program that creates 5
 * objects of school books and places them in
 * an array. User then sorts the array and the
 * new sorted array is printed based on users
 * choice.
 *
 * To compile the program:
 * javac SchoolTextBookSort.java
 *
 * To execute the program:
 * java SchoolTextBookSort
 *
 */

import java.util.Arrays;
import java.util.Scanner;


public class SchoolTextBookSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create array of 5 elements
        SchoolTextBook [] booksArr = new SchoolTextBook[5];

        // Create 5 "SchoolTextBook" object
        SchoolTextBook bookOne = new SchoolTextBook("Liang", "Intro to Programming", 439, 978013461, 115.86);
        SchoolTextBook bookTwo = new SchoolTextBook("Coronel", "Database Systems", 398, 978133762, 169.16);
        SchoolTextBook bookThree = new SchoolTextBook("Panko", "Business Data Networks and Security", 421, 978013481, 297.25);
        SchoolTextBook bookFour = new SchoolTextBook("Farrell", "Intro Object-Oriented Programming", 472, 978133710, 135.36);
        SchoolTextBook bookFive = new SchoolTextBook("Ford", "Ruby Programming", 521, 978111122, 184.25);

        // Fill array with each object
        booksArr[0] = bookOne;
        booksArr[1] = bookTwo;
        booksArr[2] = bookThree;
        booksArr[3] = bookFour;
        booksArr[4] = bookFive;

        // Initial instructions for sorting
        System.out.println("*** Sort Options ***");
        System.out.println("1) Author\n2) Title\n3) Page Count\n4) ISBN\n5) Price ");
        System.out.print("Enter Sort Method: ");
        String choice = sc.next();

        // Loop through "choice" input
        // If input is not a digit while loop is initiated
        // Input should be a numeric value
        for (int i = 0; i < choice.length(); i++)
        while (Character.isLetter(choice.charAt(i)) ) {
            System.out.println();
            System.out.println("Input must be a numeric value from 1-5");
            System.out.println("1) Author\n2) Title\n3) Page Count\n4) ISBN\n5) Price ");
            System.out.print("Re-enter Sort Method: ");
            choice = sc.next();
        }

        int intChoice = Integer.parseInt(choice);

        // Check to see if input is within valid parameters
        while (intChoice < 1 || intChoice > 5) {
            System.out.println();
            System.out.println("Input was larger than 5 or less than 1");
            System.out.println("1) Author\n2) Title\n3) Page Count\n4) ISBN\n5) Price ");
            System.out.print("Re-enter Sort Method: ");
            intChoice = sc.nextInt();
        }


        // Once valid input is made sort methods are initiated through switch statement
        // Different "compare" classes were created in SchoolTextBook.java
        switch (intChoice) {
            case 1:
                Arrays.sort(booksArr, new SchoolTextBook.CompareAuthor());
                break;
            case 2:
                Arrays.sort(booksArr, new SchoolTextBook.CompareTitle());
                break;
            case 3:
                Arrays.sort(booksArr, new SchoolTextBook.ComparePageCount());
                break;
            case 4:
                Arrays.sort(booksArr, new SchoolTextBook.CompareISBN());
                break;
            case 5:
                Arrays.sort(booksArr, new SchoolTextBook.ComparePrice());
                break;
        }
        System.out.println("\n\n");

        // Loop through array to print results
        for (int i = 0; i < booksArr.length; i++) {
            System.out.println(booksArr[i]);
        }



    }
}
