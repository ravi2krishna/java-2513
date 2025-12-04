package fourteen_abstraction;

import java.util.Scanner;

// trainer blueprint extending from AbstractPerson parent class & implements contracts 
public class Trainer extends AbstractPerson implements Personable,Payables {
    
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

    // implement Personable Method -> setPersonDetails()
    Scanner sc = new Scanner(System.in);
    public void setPersonDetails() {
        System.out.println("========= Enter Trainer Details =========");
        System.out.println("Enter ID: ");
        setPersonID(sc.nextInt());

        System.out.println("Enter Name: ");
        setPersonName(sc.next());

        System.out.println("Enter Mobile Number: ");
        setPersonMobileNumber(sc.next());

        System.out.println("Enter Age: ");
        setPersonAge(sc.nextInt());

        System.out.println("Enter Email: ");
        setPersonEmail(sc.next());
    }

    // implement Personable Method -> displayPersonDetails()
    public void displayPersonDetails() {

        System.out.println("==================================");
        System.out.println("    Welcome To "+LMS.instituteName);
        System.out.println("==================================");

        System.out.println("======= When Clicking =======");
        System.out.println("ID: "+getPersonID());
        System.out.println("Name: "+getPersonName());
        System.out.println("Mobile: "+getPersonMobileNumber());
        System.out.println("Age: "+getPersonAge());
        System.out.println("Email: "+getPersonEmail());

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

