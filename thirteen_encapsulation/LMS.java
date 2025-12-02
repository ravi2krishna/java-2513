package thirteen_encapsulation;

import java.util.Scanner;

public class LMS {
    
    // static variable
    public static String instituteName = "Edify";

    public static void main(String[] args) {

        // Student Data 
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        s1.setPersonID(sc.nextInt());

        System.out.println("Enter Name: ");
        s1.setPersonName(sc.next());

        System.out.println("Enter Mobile Number: ");
        s1.setPersonMobileNumber(sc.next());

        System.out.println("Enter Age: ");
        s1.setPersonAge(sc.nextInt());

        System.out.println("Enter Email: ");
        s1.setPersonEmail(sc.next());

        System.out.println("Enter Course Fee: ");
        s1.setCourseFee(sc.nextDouble());

        // Institute Details 
        Student.instituteInfo();
        
        // show student basic details - hover
        s1.personBasicInfo();
        
        // show student complete details - click 
        s1.personCompleteInfo();

        // student achievement 
        s1.finalAchievement();

        // Course Fee Calculation
        s1.calculateCourseFee();

        // Trainer 
        Trainer t1 = new Trainer();

        System.out.println("Enter ID: ");
        t1.setPersonID(sc.nextInt());

        System.out.println("Enter Name: ");
        t1.setPersonName(sc.next());

        System.out.println("Enter Mobile Number: ");
        t1.setPersonMobileNumber(sc.next());

        System.out.println("Enter Age: ");
        t1.setPersonAge(sc.nextInt());

        System.out.println("Enter Email: ");
        t1.setPersonEmail(sc.next());

        // show trainer basic details - hover
        t1.personBasicInfo();

        // show trainer complete details - click 
        t1.personCompleteInfo();

        // trainer payment 
        t1.calculatePayment();

    }

}
