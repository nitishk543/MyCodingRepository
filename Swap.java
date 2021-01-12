public class Swap {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 25;
        
        System.out.println("Before Swapping : Numbers are " + number1 + " and " + number2);
        
        int temp = number1;
        number1 = number2;
        number2 = temp;
        
        System.out.println("Before Swapping : Numbers are " + number1 + " and " + number2);
    }
}