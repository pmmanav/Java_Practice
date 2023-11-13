package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // Unordered
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 65);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("bnana", 95);
        fruitCalories.put("orange", 67);
        fruitCalories.put("lemon", 17); // overrides existing value
        fruitCalories.putIfAbsent("apple", 65);

        System.out.println(fruitCalories);
        System.out.println("bnana: " + fruitCalories.get("bnana"));
    }
}
