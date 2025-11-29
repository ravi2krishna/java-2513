package twelve_inheritance;

import java.util.Scanner;

// trainer blueprint extending from Person parent class
public class Trainer extends Person {
    
    // instance variables 
    int sessionsTaken;
    int totalPayment;

     // Hover Functionality With Constructor
    public Trainer(int trainerID, String trainerName) {
        this(102, "Ravi", "8889996661", 22, "ravi@gmail.com");
    }
    
    // Click Functionality With Constructor
    public Trainer(int trainerID, String trainerName, String trainerMobileNumber, int trainerAge, String trainerEmail) {
        super(trainerID, trainerName, trainerMobileNumber, trainerAge, trainerEmail);
    }

    // method to calculate payment 
    public void calculatePayment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Session Taken: ");
        sessionsTaken = sc.nextInt();
        
        // local variable
        int perSessionCost = 1500;
        totalPayment = sessionsTaken * perSessionCost;

        // trainer rating 
        Student s = new Student();
        int bonusPay = s.trainerRating();
        totalPayment = totalPayment + bonusPay;
        System.out.println("Trainer Payment: "+totalPayment);
    }

}

