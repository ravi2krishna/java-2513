package five_conditionals;

public class Demo {
    public static void main(String[] args) {
        
        // if condition
        // int num = 10;
        int num = -10;

        // assume if the num is positive then do some work 
        if (num > 0) {
            System.out.println("Number is Positive");
        }

        // check if the given number is in the range if 10 to 20
        int numb = 22;
        if (numb >= 10 && numb <= 20) {
            System.out.println("Number is in range");
        }

        // check if the number is positive or negative 
        int n1 = -10;
        if (n1 > 0) {
            System.out.println("Number is Positive");
        }
        if (n1 < 0) {
            System.out.println("Number is Negative");
        }

        // if-else condition
        if (n1 > 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }

        // voting app 
        // int personAge = 12;
        int personAge = 22;
        if (personAge >= 18) {
            System.out.println("You Can Vote");
        } else {
            System.out.println("You Cannot Vote");
        }

        // voting app using ternary operator / conditional operator
        // result = (condition) ? value_if_true : value_if_false;
        String result = (personAge >= 18) ? "You Can Vote" : "You Cannot Vote";
        System.out.println(result);

        // assign max value based on condition
        int a = 20;
        int b = 10;

        int max = (a>b) ? a : b;
        System.out.println(max);



    }
}
