package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Lists are ordered
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("bnana");
        fruits.add("orange");
        fruits.set(2, "grape");
        fruits.add("lemon");
        fruits.remove(4);
        fruits.remove("lemon"); // will remove the first instance of lemon

        System.out.println(fruits);
        System.out.println(fruits.get(0)); // giving index as a parameter
        System.out.println("index of first lemon: " + fruits.indexOf("lemon"));
        System.out.println("index of last lemon: " + fruits.lastIndexOf("lemon"));

        List moreFruit = List.of("cherry", "cranberry", "plum");
    }
}
