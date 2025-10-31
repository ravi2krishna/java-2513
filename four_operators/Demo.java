package four_operators;

public class Demo {
    public static void main(String[] args) {
        
        // Arithmetic Operators ==> + - * / % 
        int numOne = 10;
        int numTwo = 5;

        System.out.println("Sum of Numbers: "+(numOne+numTwo));
        System.out.println("Difference of Numbers: "+(numOne-numTwo));
        System.out.println("Product of Numbers: "+(numOne*numTwo));
        System.out.println("Division of Numbers: "+(numOne/numTwo));
        System.out.println("Remainder of Of Division: "+(numOne%numTwo));

        // Without Compound Assignment Operator
        int numValue = 10;
        numValue = numValue + 5;
        System.out.println("Regular Way: "+numValue);

        // With Compound Assignment Operator
        int numbValue = 10;
        numbValue+= 5;
        System.out.println("Short Hand Way: "+numbValue);
        numbValue*= 10;
        System.out.println("Short Hand Way: "+numbValue);

        // With Compound Assignment Operator increment 
        int countValue = 1;
        countValue += 1;
        System.out.println("Count Is: "+countValue);
        countValue -= 1;
        System.out.println("Count Is: "+countValue);

        // Increment Operator
        int counterValue = 1;
        counterValue++;
        System.err.println("Count Is: "+counterValue);

        // Decrement Operator 
        counterValue--;
        System.err.println("Count Is: "+counterValue);

        // Comparison Operators
        int num1 = 10;
        int num2 = 5;
        int num3 = 5;

        System.out.println(num1 == num2);
        System.out.println(num2 == num3);
        System.out.println(num2 != num3);
        System.out.println(num1 > num3);
        System.out.println("=============");
        
        // Logical Operators 
        int a = 10;    
        int b = 5;
        int c = 3;
        int d = 1;

        System.out.println(a>b && c>d); // T && T -> T
        System.out.println(a>b && c<d); // T && F -> F

        System.out.println(a>b || c>d); // T || T -> T
        System.out.println(a>b || c<d); // T || F -> T
        System.out.println(a<b || c<d); // F || F -> F

        System.out.println(a>b); // T 
        System.out.println(! (a>b)); // T -> F

        // Bitwise Operators 
        int b1 = 5; // 0000000000000101
        int b2 = 3; // 0000000000000011
                    // 0000000000000111  (|)
                    // 0000000000000001  (&)
        System.out.println(b1 & b2);
        System.out.println(b1 | b2);

    }
}
