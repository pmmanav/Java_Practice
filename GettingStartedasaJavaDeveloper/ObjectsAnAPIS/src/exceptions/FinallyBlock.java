package exceptions;

import java.io.*;
import java.util.*;

public class FinallyBlock {
    public static void main(String[] args) {
        File file = new File(
                "C:\\Users\\INPRMAN2\\Pictures\\Java_Practice\\GettingStartedasaJavaDeveloper\\ObjectsAnAPIS\\src\\exceptions\\files\\numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }

        } catch (FileNotFoundException | InputMismatchException e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            // Code you wish to execute no matter what happens.
            fileReader.close();
        }
    }
}
