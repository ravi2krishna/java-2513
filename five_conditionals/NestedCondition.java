package five_conditionals;

import java.util.Scanner;

public class NestedCondition {
    public static void main(String[] args) {
        
        // Scanner use case for reading inputs 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter You Age: ");
        int age = input.nextInt();
        
        // voting app with id verification using nested conditionals 
        if (age >= 18) {
            // check for id 
            System.out.println("Enter Your Aadhar ID: ");
            int aadharID = input.nextInt();

            // nested condition
            if (aadharID == 123456) {
                System.out.println("You Can Vote ");
            } else {
                System.out.println("You Need an Correct ID To Vote ");
            }
            
        } else {
            System.out.println("You Cannot Vote, You are too Young ");
        } 

    }
}
