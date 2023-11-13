package exceptions;

import java.io.File;
import java.io.*;

public class ReThrowingException {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        rethrowException();
    }

    public static void rethrowException() throws IOException {
        File file = new File("resourcex/nonexistent.txt");
        file.createNewFile();
    }
}
