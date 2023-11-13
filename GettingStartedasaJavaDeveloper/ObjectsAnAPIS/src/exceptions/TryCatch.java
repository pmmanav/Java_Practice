package exceptions;

import java.io.File;
import java.io.IOException;

/**
 * 
 */
public class TryCatch {
    public static void main(String[] args) {
        File file = new File("resourcex/nonexistent.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Sorry! An error has occured.");
            System.out.println("Sorry! An error has occured: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
