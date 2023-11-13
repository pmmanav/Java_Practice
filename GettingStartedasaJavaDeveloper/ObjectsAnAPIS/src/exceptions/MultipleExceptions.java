package exceptions;

import java.io.File;
import java.io.*;
import java.util.*;

public class MultipleExceptions {
    public static void main(String[] args) {
        File file = new File(
                "C:\\Users\\INPRMAN2\\Pictures\\Java_Practice\\GettingStartedasaJavaDeveloper\\ObjectsAnAPIS\\src\\exceptions\\files\\numbers.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
            fileReader.close();
        } catch (FileNotFoundException | InputMismatchException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
