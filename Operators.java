//Java Program to show the use of all operators


public class Operators {
    public static void main(String[] args) {
                        //Arithmetic Operators(+, - , *, /, %)
        int num1 = 16;                                                               
        int num2 = 7;
        
        int sum = num1 + num2;                       //Addition Arithmetic operator
        int difference = num1 - num2;                //Subtraction Arithmetic operator
        int product = num1 * num2;                   //Product Arithmetic operator
        int division = num1/num2;                    //Division Arithmetic operator
        int remainder = num1 % num2;                 //Modulus Arithmetic operator

        System.out.println("------------Use of Arithmetic Operators(+, - , *, /, %)--------------- ");
        System.out.println("\nSum of                   " + num1 + " and  " + num2 + " is " + sum);
        System.out.println("Subtraction of           " + num2 + " from " + num1 + " is " + difference);
        System.out.println("Product of               " + num1 + " and  " + num2 + " is " + product);
        System.out.println("Division of              " + num1 + " with " + num2 + " is " + division);
        System.out.println("Remainder after dividing " + num1 + " with " + num2 + " is " + remainder);
        
        
                        //Assignment Operators(=, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=)
        int number = 5;
        System.out.println("\n------------Use of Assignment Operators(=, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=)------------ ");
        System.out.println("\nResult of                " + number + "  += 5 is " + (number+=5));  //Same as number = number + 5
        System.out.println("Result of                " + number + " -= 5 is " + (number-=5));    //Same as number = number - 5
        System.out.println("Result of                " + number + "  *= 5 is " + (number*=5));    //Same as number = number * 5
        System.out.println("Result of                " + number + " /= 5 is " + (number/=5));    //Same as number = number / 5
        System.out.println("Result of                " + number + "  %= 2 is " + (number%=2));    //Same as number = number % 2
        
                        
                        //Increment and Decrement Operators(++x, x++, --x, x--)
        int number1 = 5;
        System.out.println("\n------------Use of Increment and Decrement Operators(++x, x++, --x, x--)------------- ");
        System.out.println("\nBefore increment if result printed,    5 ++ =  " + number1++); //Post-Increment Operator
        System.out.println("Result  printed  after   increment,    5 ++ = " + number1);
        
        int number2 = 10;
        System.out.println("Result is printed after  increment,  ++10   = " + ++number2);  //Pre-Increment Operator
        
        int number3 = 15;
        System.out.println("Before increment if result printed,    15-- = " + number3--);  //Post-Decrement Operator
        System.out.println("Result  printed   after  increment,    15-- = " + number3);
        
        int number4 = 20;
        System.out.println("Result is printed  after increment,  --20   = " + --number4);  //Pre-Decrement Operator
        
                         //Bitwise Operators(~, &, |, ^, <<, >>, >>>)
        
        int digit1 = 5;
        int digit2 = 1;
        System.out.println("\n------------Use of Bitwise Operators(~, &, |, ^, <<, >>, >>>)------------- ");
        System.out.println("\nBitwise NOT(~)                     result of 5        is " + ~5);                               //Bitwise NOT Operator
        System.out.println("Bitwise  AND(&)                    result of " + digit1 + " &   " + digit2 + "  is " + (5 & 1));  //Bitwise AND Operator  
        System.out.println("Bitwise  OR (|)                    result of " + digit1 + " |   " + digit2 + "  is " + (5 | 1) ); //Bitwise OR Operator   
        System.out.println("Bitwise  XOR  (^)                  result of " + digit1 + " ^   " + digit2 + "  is " + (5 ^ 1));  //Bitwise XOR Operator  
        System.out.println("Bitwise  Shift   Left  (<<)        result of " + digit1 + " <<  " + digit2 + "  is " + (5 << 1)); //Bitwise Shift Left Operator  
        System.out.println("Bitwise  Shift Right- Signed(>>)   result of " + digit1 + " >>  " + digit2 + "  is " + (5 >> 1)); //Bitwise Shift Right- Signed Operator  
        System.out.println("Bitwise  Shift Right Unsigned(>>>) result of " + digit1 + " >>> " + digit2 + "  is " + (5 >>> 1));//Bitwise Shift Right Unsigned Operator  
        
                         //Logical Operators(!, &&, ||)
        
        boolean choice1 = true;
        System.out.println("\n------------Use of Logical Operators(!, &&, ||) --------------");
        System.out.println("\nUsing Logical NOT Operator(!),   Result of !" + choice1 + "             is " + !choice1);    //Logical NOT Operator
        
        boolean choice2 = false;
        boolean choice3 = true;
        System.out.println("Using Logical AND Operator(&&),  Result of  false  &&  true  is " + (choice2 && choice3));    //Logical AND Operator
        
        System.out.println("Using Logical OR  Operator(||),  Result of  false  ||  true  is " + (choice2 || choice3));    //Logical OR Operator
        
                         
                        //Comparison Operators(==, !=, >, <, >=, <=)
                        
        int comp1 = 5;
        int comp2 = 6;
        
        System.out.println("\n--------------Use of Comparison Operator(==, !=, >, <, >=, <=)--------------- ");
        System.out.println("\nis 5 equal   to   6?             -- " + (comp1 == comp2));   //Equality Comparison //Returns false
        System.out.println("is 5 not equal to 6?             -- " + (comp1 != comp2));   //Not Equal Comparison
        System.out.println("is 5 greater than 6?             -- " + (comp1 > comp2));    //Greater than Comparison
        System.out.println("is 5  less  than  6?             -- " + (comp1 < comp2));    //Less than Comparison
        System.out.println("is 5 greater than or equal to 6? -- " + (comp1 >= comp2));   //Greater than or equal to Comparison
        System.out.println("is 5 less than or  equal  to  6? -- " + (comp1 <= comp2));   //Less than or equal to Comparison
        
        
                        //Ternary Operator((x>y) ? "true":"false"))
        
        int marks = 45;
        System.out.println("\n-------------Use of Ternary Operator((x>y) ? true:false)--------------");
        String result = (marks > 40) ? "You are Passed" : "You are Failed";
        System.out.println("\nResult of String result = (marks > 40) ? "+ "(You are Passed) : (You are Failed)  -- " + result);
        
        
    }
}