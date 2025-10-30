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


    }
}
