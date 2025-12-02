package thirteen_encapsulation;

import java.util.Scanner;

// trainer blueprint extending from Person parent class
public class Trainer extends Person {
    
    // instance variables 
    private int sessionsTaken;
    private int totalPayment;

        public int getSessionsTaken() {
        return sessionsTaken;
    }

    public void setSessionsTaken(int sessionsTaken) {
        this.sessionsTaken = sessionsTaken;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
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

