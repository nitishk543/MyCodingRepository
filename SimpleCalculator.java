
//Simple java program to calculate +, -, *, / and % with user input

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any two integers: "); //taking user input
        double num1 = scanner.nextDouble();             //storing in a variable
        double num2 = scanner.nextDouble();             //storing in a variable

        double sum = num1 + num2;                       //Calculating Sum
        double difference = num1 - num2;                //Calculating Difference
        double product = num1 * num2;                   //Calculating Product
        double division = num1/num2;                    //Calculating Division
        double remainder = num1 % num2;                 //Calculating Remainder

        System.out.println("First Number: " + num1);    //Printing Results
        System.out.println("Second Number: " + num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("Subtraction of " + num1 + " from " + num2 + " is " + difference);
        System.out.println("Product of " + num1 + " and " + num2 + " is " + product);
        System.out.println("Division of " + num1 + " with " + num2 + " is " + division);
        System.out.println("Reaminder after dividing " + num1 + " with " + num2 + " is " + remainder);
    }
}
