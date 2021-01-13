//Program to Understand increment and decrement Operator/Unary Operator

public class IncrementDecrement {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 10;
        int var3 = 8;
        int var4 = 15;
        
        //result is printed before increment, Output is 5
        System.out.println("5++ = " + var1++); 
        
        //result is printed after increment, Output is 11
        System.out.println("++10 = " + ++var2); 
        
        //result is printed after increment, Output is 11
        System.out.println("8-- = " + var3--); 
        
        //result is printed after increment, Output is 11
        System.out.println("--15 = " + --var4);
    }
}