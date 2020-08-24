import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCollegeStudent {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Student 1 First Name: ");
        String firstName1 = scanner.next();
        System.out.println("Student 1 Last Name: ");
        String lastName1 = scanner.next();
        System.out.println("Student 1 Enrollment Year (EX: 2020): ");
        int year1 = scanner.nextInt();
        System.out.println("Student 1 Enrollment Month (EX: 8): ");
        int month1 = scanner.nextInt();
        System.out.println("Student 1 Enrollment Day (EX: 19): ");
        int day1 = scanner.nextInt();

        System.out.println("\n\n");

        System.out.println("Student 2 First Name: ");
        String firstName2 = scanner.next();
        System.out.println("Student 2 Last Name: ");
        String lastName2 = scanner.next();
        System.out.println("Student 2 Enrollment Year (EX: 2020): ");
        int year2 = scanner.nextInt();
        System.out.println("Student 2 Enrollment Month (EX: 8): ");
        int month2 = scanner.nextInt();
        System.out.println("Student 2 Enrollment Day (EX: 19): ");
        int day2 = scanner.nextInt();

        GregorianCalendar cal1 = new GregorianCalendar(year1, month1-1, day1);
        CollegeStudent student1 = new CollegeStudent(firstName1, lastName1, cal1);

        GregorianCalendar cal2 = new GregorianCalendar(year2, month2-1, day2);
        CollegeStudent student2 = new CollegeStudent(firstName2, lastName2, cal2);

        System.out.println("\n\n");
        System.out.println("Student Info");
        System.out.println("============");
        System.out.println(student1);
        System.out.println(student2);

        /*
        CollegeStudent collstd[] = new CollegeStudent[2];


        for(int i = 0; i < 2; i++) {
            System.out.println("Student " + (i+1) + " First Name: ");
            String firstName = scanner.next();
            System.out.println("Student " + (i+1) + " Last Name: ");
            String lastName = scanner.next();
            System.out.println("Student " + (i+1) + " Enrollment Year (EX: 2020): ");
            int year = scanner.nextInt();
            System.out.println("Student " + (i+1) + " Enrollment Month (EX: 8): ");
            int month = scanner.nextInt();
            System.out.println("Student " + (i+1) + " Enrollment Day (EX: 19): ");
            int day = scanner.nextInt();

            GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
            CollegeStudent st = new CollegeStudent(firstName, lastName, cal);

            collstd[i] = st;

            System.out.println();
        }


        for(int i = 0; i < collstd.length; i++) {
            System.out.println(collstd[i]);
        }

         */

    }

}
