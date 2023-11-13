package functionalOperations;

import java.util.ArrayList;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<String> veggies = List.of(
                "spinach",
                "potato",
                "tomato",
                "cabbage",
                "peas",
                "green beans",
                "brussel sprouts",
                "carrots");
        System.out.println(veggies);
        veggies.stream().anyMatch(v -> v.contains(" "));
        veggies.stream().filter(v -> v.startsWith("c")).forEach(System.out::println);
        veggies.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println(veggies);
    }
}
