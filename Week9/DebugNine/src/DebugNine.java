/*
 * Jaime Rodriguez
 * Assignment 9.2
 * October 12, 2020
 *
 * Purpose: Purposely insert "bugs" for
 * other students to find and fix
 *
 * To compile the program:
 * javac DebugNine.java
 *
 * To execute the program:
 * java DebugNine
 *
 */

import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class DebugNine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Path file = Paths.get("Employee.txt");
        Path fullFile = file.toAbsolutePath();

        final int NUMRECS = 3;

        String employeeRec = "000,       ,00.00" + System.getProperty("line.separator");

        final int RECSIZE = employeeRec.length();

        FileChannel fc = null;
        String delimiter = ",";
        String idNumber, name, payRate // Missing closing semi-colon

        int total = 0;

        System.out.println("=== Enter 3 Employee Records ===");

        try {
            fc = (FileChannel)Files.newByteChannel(fullFile, CREATE, READ, WRITE);

            // "records" is not a valid variable
            // Should read "Total"
            while(records < NUMRECS ) {
                System.out.println("ID Number (EX: 145)");
                idNumber = sc.next();
                System.out.println("Name");
                name = sc.next();
                System.out.println("Pay Rate (EX: 45.50");
                payRate = sc.next();
                employeeRec = idNumber + delimiter + name + delimiter + payRate + System.getProperty("line.separator");
                byte[] employeeData = employeeRec.getBytes();
                ByteBuffer recordBuffer = ByteBuffer.wrap(employeeData);
                fc.position(Integer.parseInt(idNumber) * RECSIZE);
                fc.write(recordBuffer);
                total++;
                System.out.println();
            }
            fc.close();
            // catch statement should omit "error"
        } catch error(Exception e) {
            System.out.println("Error Message: " + e);
        }

    }
}
