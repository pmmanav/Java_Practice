package collections;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoops {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(); // by default element type are object, We can define type also.
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("bnana");
        fruits.add("orange");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
