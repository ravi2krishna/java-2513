package seven_oops_basics;

import java.util.Scanner;

// trainer blueprint 
public class Trainer {
    
    // instance variables 
    int trainerID;
    String trainerName;
    int sessionsTaken;
    int totalPayment;
    
    // method to display trainer info 
    public void trainerInfo(){
        System.out.println("======= Details =======");
        System.out.println("ID: "+trainerID);
        System.out.println("Name: "+trainerName);
    }

    // method to calculate payment 
    public void calculatePayment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Session Taken: ");
        sessionsTaken = sc.nextInt();
        
        // local variable
        int perSessionCost = 1500;
        totalPayment = sessionsTaken * perSessionCost;

        // student rating 
        Student s = new Student();
        int bonusPay = s.trainerRating();
        totalPayment = totalPayment + bonusPay;
        System.out.println("Trainer Payment: "+totalPayment);
    }

}
