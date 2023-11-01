package gross_calculator;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        System.out.println("How many sales did the employee make this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        
        // Quick detour for the bonus earners
        if(sales > quota)
        {
            salary = salary + bonus;
        }
        //Output
        System.out.println("The Employee pay is:: "+ salary);
    }
}
