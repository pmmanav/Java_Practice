package gross_calculator;

public class GrossPayCalculator {
    //main method => entry point for running a program in java
    public static void main(String[] args) {
        //1. Get the number of hours worked
        int hours = 40; 
        //2. Get the hourly pay rate
        double payRate = 25.50;
        //3. Multiply hours and pay rate
        double grossPay = hours * payRate;
        //4. Display Result
        System.out.println("Gross Pay: " + grossPay);
    }
}
