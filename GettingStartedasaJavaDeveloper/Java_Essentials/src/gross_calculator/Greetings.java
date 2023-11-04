package gross_calculator;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        greetUser();
    }

    public static void greetUser(){
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hi there, " + name); 
    }
}
