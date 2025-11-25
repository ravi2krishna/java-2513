package eleven_static;

import java.util.Scanner;

// student blueprint 
public class Student {

    // static variables 
    public static String instituteName;
    public static double globalDiscount;

    // static block for initialization of static variables 
    static {
        instituteName = "Digital Edify";
        globalDiscount = 0.1;
    }

    // static block for working with static variables 
    public static void instituteInfo() {
        System.out.println("======= INSTITUTE DETAILS =======");
        System.out.println("Institute Name: "+instituteName);
        System.out.println("Currently We Have Discount Of: "+(globalDiscount * 100)+ " % for everyone");
    }

    // instance variables 
    int studentID;
    String studentName;
    String studentMobileNumber;
    int studentAge; 
    String studentEmail; 

    int studentAttendance;
    int studentScore;

    double courseFee;
    
    // Working With Arrays
    int[] subjectScores; // will initialize this array dynamically 

    Scanner sc = new Scanner(System.in);

    // Adding Constructor Functionality 
    public Student() {
        System.out.println("Default Constructor");
    }

    // Hover Functionality With Constructor
    public Student(int studentID, String studentName) {
        // this.studentID = studentID;
        // this.studentName = studentName;
        // this();
        this(101, "John", "8889996661", 22, "john@gmail.com",30000);
    }

    // Click Functionality With Constructor
    public Student(int studentID, String studentName, String studentMobileNumber, int studentAge, String studentEmail, double courseFee) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentMobileNumber = studentMobileNumber;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
        this.courseFee = courseFee;
    }

    // method to display basic student info i.e hover
    public void studentBasicInfo(){

        System.out.println("==================================");
        System.out.println("    Welcome To "+LMS.instituteName);
        System.out.println("==================================");

        System.out.println("======= When Hovering =======");
        System.out.println("ID: "+studentID);
        System.out.println("Name: "+studentName);
    }

    // method to display complete student info i.e clicking
    public void studentCompleteInfo(){

        System.out.println("==================================");
        System.out.println("    Welcome To "+LMS.instituteName);
        System.out.println("==================================");

        System.out.println("======= When Clicking =======");
        System.out.println("ID: "+studentID);
        System.out.println("Name: "+studentName);
        System.out.println("Mobile: "+studentMobileNumber);
        System.out.println("Age: "+studentAge);
        System.out.println("Email: "+studentEmail);
    }

    // Calculate Course Fee 
    public void calculateCourseFee(){
        double discount = 0;
        System.out.println("Enter COUPON: ");
        String coupon = sc.next();
        if (coupon.equals("PROMO")) {
            discount = 5000;
        } else if (coupon.equals("FIFTY")) {
            discount = 15000;
        }

        double finalFee = courseFee - discount;

        // apply global discount 
        double gd = courseFee * globalDiscount;

        System.out.println("Actual Fee: "+courseFee);
        System.out.println("Discount Applied: "+discount);
        System.out.println("Global Discount Applied: "+gd);
        System.out.println("Final Fee To Pay: "+(finalFee-gd));

    } 

    // method to calculate attendance credits
    public int attendanceCredits(){
        System.out.println("Enter Attendance: ");
        // local variable
        int sessionsAttended = sc.nextInt();

        if (sessionsAttended >=30) {
            return 5;
        } else if (sessionsAttended >=20) {
            return 3;
        } else {
            return 0;
        }
    }

    // Taking Five Subject Scores 
    public int calculateAverageScore() {
        
        System.out.println("Enter Number Of Subjects: ");
        int numOfSubjects = sc.nextInt();

        // Initialize Array with Above numOfSubjects
        subjectScores = new int[numOfSubjects];
        
        // Read Scores into array
        int totalScore = 0;
        for (int i = 0; i < subjectScores.length; i++) {
            System.out.println("Enter Scores For Subject "+(i+1)+":");
            subjectScores[i] = sc.nextInt();
            totalScore += subjectScores[i];
        }

        int averageScore = totalScore / subjectScores.length ;
        System.out.println("Average Score: "+averageScore);
        return averageScore;

    }

    // method to calculate score credits
    public int scoreCredits(int averageScore){

        if (averageScore >=85) {
            return 5;
        } else if (averageScore >=60) {
            return 3;
        } else {
            return 0;
        }
    }

    // method to calculate award status 
    public void finalAchievement(){
        // local variable
        int finalCredits = attendanceCredits() + scoreCredits(calculateAverageScore());

        if (finalCredits >=10) {
            System.out.println("GOLD");
        } else if (finalCredits >=8) {
            System.out.println("SILVER");
        } else {
            System.out.println("BRONZE");
        }
    }

    // method to give rating to trainer
    public int trainerRating() {
        System.out.println("Enter Trainer Rating");
        int trainerRating = sc.nextInt();
        
        if (trainerRating>=5) {
            return 5000;
        } else {
            return 0;
        }
    }
    
}