package gross_calculator;

import java.util.Scanner;

public class InstantCreditCheck {
    public static void main(String[] args) {
        // Get Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Salary");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        scanner.close();

        //Check if user is qualified
        isUserQualified(creditScore, salary);
    }

    public static void isUserQualified(int creditScore, double salary)
    {
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(salary >= requiredSalary && creditScore >= requiredCreditScore)
        {
            System.out.println("Congrats! You've beenn approved!");
        }
        else{
            System.out.println("Sorry, you've been declined.");
        }
    }
}
