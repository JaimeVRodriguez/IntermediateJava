import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCollegeStudent {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        CollegeStudent arr[] = new CollegeStudent[2];

        for(int i = 0; i < arr.length; i++) {
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

            arr[i] = st;

            System.out.println();
        }


        System.out.println("Student Info");
        System.out.println("============");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

}
