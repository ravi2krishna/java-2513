package five_conditionals;

import java.util.Scanner;

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

        // if-else-if or else if ladder
        int marks = 65;

        if (marks >= 90) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // go with grading system 
        if (marks >= 90) {
            System.out.println("A Grade");
        } else if (marks >= 75) {
            System.out.println("B Grade");
        } else if (marks >= 60) {
            System.out.println("C Grade");
        } else if (marks >= 50) {
            System.out.println("D Grade");
        } else if (marks >= 35) {
            System.out.println("E Grade");
        } else {
            System.out.println("Failed");
        }

        // switch-case 
        int dayNumber = 6;

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

        // Scanner use case for reading inputs 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter You Name: ");
        String name = input.next();
        System.out.println("Welcome: "+name);

        // voting app using input 
        System.out.println("Enter You Age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You Can Vote "+name);
        } else {
            System.out.println("You Cannot Vote "+name);
        }

    }
}
