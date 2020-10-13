/*
 * Jaime Rodriguez
 * Assignment 9.2
 * October 13, 2020
 *
 * Purpose: Correct bug error in classmates
 * program to function properly
 *
 * To compile the program:
 * javac FileOut.java
 *
 * To execute the program:
 * java FileOut
 *
 */

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class FileOut  {
    public static void main(String[] args)  {
        Path file =  Paths.get("File path here");
        String s = "ABCDF";
        // .getByte was missing the "s"
        byte[] data = s.getBytes();
        OutputStream output = null;
        try  {
            // Wrong method was used.
            // Changed from BufferedInputStream
            output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            output.write(data);
            output.flush();
            output.close();
        }
        catch(Exception e)  {
            System.out.println("Message: " + e);
        }
    }
}