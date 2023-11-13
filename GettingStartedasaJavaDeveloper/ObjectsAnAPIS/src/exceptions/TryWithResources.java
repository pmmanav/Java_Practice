package exceptions;

import java.io.*;
import java.util.*;

public class TryWithResources {
    public static void main(String[] args) {
        File inputFile = new File(
                "C:\\Users\\INPRMAN2\\Pictures\\Java_Practice\\GettingStartedasaJavaDeveloper\\ObjectsAnAPIS\\src\\exceptions\\files\\numbers.txt");
        File outputFile = new File("files/output.txt");
        // We do not need to execute finally to close the fileReader & FileWriter. Java
        // automatically closes them after try Block.
        // Only works with claases that implements Closable & AutoClosable interfaces.
        // Both Scanner & PrintWriter implemnet these interfaces.
        try (
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile)) {

            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }

        } catch (FileNotFoundException | InputMismatchException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
