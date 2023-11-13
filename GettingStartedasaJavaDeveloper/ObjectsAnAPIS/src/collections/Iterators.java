package collections;

import java.util.HashSet;
import java.util.Set;

public class Iterators {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("bnanaa");
        fruits.add("papaya");
        fruits.add("lemon");
        fruits.add("apple");

        var i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
