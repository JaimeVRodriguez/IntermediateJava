/*
 * Jaime Rodriguez
 * Assignment 4.2
 * September 7, 2020
 *
 * Purpose: Purposely insert "bugs" for
 * other students to find and fix
 *
 * To compile the program:
 * javac DebugFour.java
 *
 * To execute the program:
 * java DebugFour
 *
 */

import java.util.Scanner;

class Question {

    // Should be a comma seperator or on a new line
    public String answer && correctAnswer;

    public void question() {
        System.out.println("*** Course Name Quiz ***");
        System.out.println("What is the course code to this Java Class?\n\n" +
                "a) CIS305\n" + "b) CIS402A\n" + "c) WEB311\n" + "d) CIS220\n\n" + "Enter full course code EX: CIS305");
    }

    public void getAnswer() {
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();
        // Option one would be to reinitialize answer to answer.toUpperCase()
        answer.toUpperCase();
    }

    public void verifyAnswer() {
        // Missing closing ;
        correctAnswer = "CIS402A"
        // Option two would be to equalsIgnoreCase
        if (answer.equals(correctAnswer) == true) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect\n" +
                    "Your Answer: " + answer + "\n" +
                    "Correct Answer: " + correctAnswer);
        }
    }
}

public class DebugFour {

    public static void main(String[] args) {

        Question easy = new Question();

        easy.question();
        easy.getAnswer();
        easy.verifyAnswer();
    }
}
