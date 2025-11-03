package six_loops;

import java.util.Scanner;

public class Demo {
    
    public static void main(String[] args) {
        
        // greet 
        System.out.println("Good Morning");

        // greet 0 times -> no loops
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");

        // for loop 
        for (int i = 0; i < 5; i++) {
            // Code to be executed in each iteration
            System.out.println("Iteration: " + i);
        }

        // greet 10 times using for loop 
        for (int i = 1; i <= 30; i++) {
            System.out.println("Good Morning: " + i);
        }

        // for loop with decrement
        for (int i = 5; i >= 1; i--) {
            // Code to be executed in each iteration
            System.out.println("Iteration: " + i);
        }


        // while loop 
        int count = 0;
        while (count < 5) {
            // Code to be executed
            System.out.println("Count: " + count);
            count++;
        }

        // while use case -> check for phone passcode break
        int correctPin = 5678;
        int enteredPin = 0;

        while (enteredPin != correctPin) {
            System.out.println("Enter Phone Pin: ");
            Scanner input = new Scanner(System.in);
            enteredPin = input.nextInt();
        }

        System.out.println("Phone Unlocked");

        // do-while 
        int i = 0;
        do {
            // Code to be executed at least once
            System.out.println("Value of i: " + i);
            i++;
        } while (i < 2);
        
        // i = 6
        do {
            // Code to be executed at least once
            System.out.println("Value of i: " + i);
            i++;
        } while (i <= 5);


    // nested for loop
    for (int outer = 0; outer < 5; outer++) {
        // Code to be executed in each iteration
        System.out.println("Outer Iteration: " + outer);
        
        // inner for loop
        for (int inner = 0; inner < 3; inner++) {
            // Code to be executed in each iteration
            System.out.println("Inner Iteration: " + inner);
        }    

    }    

    for (int outer = 1; outer < 10; outer++) {
        // inner for loop
        for (int inner = 1; inner < 10; inner++) {
            // Code to be executed in each iteration
            System.out.println(outer + "X" + inner + " =" +(outer*inner));
        }    

    }    

    // nested while
        int out = 3;
        while (out < 5) {
            int in = 1;
            while (in < 5) {
               System.out.println(out + "X" + in + " =" +(out*in));
               in++; 
            }
            out++;
        }


    }

}
