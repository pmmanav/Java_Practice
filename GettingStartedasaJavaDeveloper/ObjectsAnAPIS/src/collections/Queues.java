package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        // first in first out
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("bnana");
        fruits.add("orange");
        var removedFruit = fruits.remove();
        System.out.println(fruits);
        System.out.println("removed: " + removedFruit);
        System.out.println("What's the head of queue: " + fruits.peek());
    }
}
