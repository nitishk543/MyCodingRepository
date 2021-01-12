import java.util.Scanner;   //Scanner package for taking user input

public class AsciiValue {
    public static void main(String[] args) {
        System.out.println("Enter any Alphabet among A-Z/a-z");
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);   //Reading user input
        
        int asciiValue = character;                 //assigning Character to its ASCII Value
        System.out.println("The ASCII Value of " + character + " is " + asciiValue);
    }
    
}