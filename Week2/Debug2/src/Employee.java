import java.util.Scanner;

public class Employee {

    private String employeeType, firstName, lastName;
    private int employeeNumber;

    public Employee(String firstName, String lastName, String employeeType, int employeeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeType = employeeType;
        this.employeeNumber = employeeNumber;
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
    public String getEmployeeType() {
        return employeeType;
    }
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String toString() {
        return "First Name: "+firstName+"\t Last Name: "+lastName+"\t Employee Type: "+employeeType+"\t Employee Number: "+employeeNumber;
    }

    public static void main(String [] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = sc.next();
        System.out.println("Last Name");
        String lastName = sc.next();
        System.out.println("Enter Employee Title:");
        String employeeType = sc.next();
        System.out.println("Enter Employee Number:");
        String employeeNumber = sc.nextInt();

        Employee employeeOne = new Employee(firstName, lastName, employeeType, employeeNumber);

        System.out.println();
        System.out.println("Employee Info");
        System.out.println("=============");
        System.out.println(employeeOne);


    }


}
