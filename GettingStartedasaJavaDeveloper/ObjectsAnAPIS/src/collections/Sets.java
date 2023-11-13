package collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Sets
 */
public class Sets {
    public static void main(String[] args) {
        // Set is an ordered collection
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("bnanaa");
        fruits.add("papaya");
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println("has lemon: " + fruits.contains("lemon"));

        fruits.remove("lemon");
        System.out.println("number of elements after removeing lemon: " + fruits.size());
        // easier way to add fruits
        Set moreFruit = Set.of("pear", "raisin", "cherry"); // By declaring this way, it becomes immutable

        moreFruit.add("cranberry"); // Will not give compile error, but program will crash
        moreFruit.remove("cherry");
        System.out.println(moreFruit);
    }

}