import java.util.Arrays;
import java.util.Scanner;

class Utility {

    static boolean numberOrNot(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}

public class SchoolTextBookSort {

    public static void main(String[] args) {

        SchoolTextBook [] booksArr = new SchoolTextBook[5];

        SchoolTextBook bookOne = new SchoolTextBook("Liang", "Intro to Programming", 439, 978013461, 115.86);
        SchoolTextBook bookTwo = new SchoolTextBook("Coronel", "Database Systems", 398, 978133762, 169.16);
        SchoolTextBook bookThree = new SchoolTextBook("Panko", "Business Data Networks and Security", 421, 978013481, 297.25);
        SchoolTextBook bookFour = new SchoolTextBook("Farrell", "Intro Object-Oriented Programming", 472, 978133710, 135.36);
        SchoolTextBook bookFive = new SchoolTextBook("Ford", "Ruby Programming", 521, 978111122, 184.25);

        booksArr[0] = bookOne;
        booksArr[1] = bookTwo;
        booksArr[2] = bookThree;
        booksArr[3] = bookFour;
        booksArr[4] = bookFive;



        int length = booksArr.length;

        Scanner sc = new Scanner(System.in);

        System.out.println("1) Author\n2) Title\n3) Page Count\n4) ISBN\n5) Price ");
        System.out.print("Enter Sort Method: ");
        String choice = sc.next();

        for (int i = 0; i < choice.length(); i++)
        while (Character.isLetter(choice.charAt(i)) ) {
            System.out.print("Re-enter: ");
            choice = sc.next();
        }

        int intChoice = Integer.parseInt(choice);

        while (intChoice < 1 || intChoice > 5) {
            System.out.print("Re-enter Number: ");
            intChoice = sc.nextInt();
        }

        
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

        for (int i = 0; i < length; i++) {
            System.out.println(booksArr[i]);
        }



    }
}
