package objects;

import java.util.Scanner;

public class HomeAreaCalculatorWithMethods {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) { 
        Rectangle kichen = new Rectangle(200, 400);
        Rectangle bathroom = getRoom();
        double area = calculateTotalArea(kichen, bathroom);
        System.out.println("The Total area is: " + area);


        scanner.close();

        //Array Function calls
        calculateSum();
        calculateSum(1, 2, 3);
        calculateSum(new int[]{1, 2, 3, 4});
    }

    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2)
    {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static Rectangle getRoom()
    {
        System.out.println("Emter the length of your room");
        double length = scanner.nextDouble();
        System.out.println("Emter the widthh of your room");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);
    }

    /*
     * Arrays Example below
     * Variable arguments
     * In a method with more than one paramete, only one parameter can be varargs parameter. It should be last parameter.
     */
    public static void calculateSum(int ...a){  // parameter is treated as an array
        int sum = 0;
        for(int i=00; i< a.length;i++)
        {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}