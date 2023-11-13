package collections;

import java.util.*;

/**
 * ForEachWithLambdas
 * Lambda Expression => lambda expression is a block of code that accepts
 * parameter and returns a value.
 */
public class ForEachWithLambdas {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("bnana");
        fruits.add("orange");

        fruits.forEach(x -> System.out.println(x));
        fruits.forEach(System.out::println); // this passes the current element to println
        fruits.forEach(f -> {
            f = "fruits: " + f;
            System.out.println(f);
        });
        System.out.println(fruits);
        printMap_forEach();
    }

    public static void printMap_forEach() {
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 65);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("bnana", 95);
        fruitCalories.put("orange", 67);

        fruitCalories.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}