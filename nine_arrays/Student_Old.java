package nine_arrays;

import java.util.Scanner;

// student blueprint 
public class Student_Old {

    // instance variables 
    int studentID;
    String studentName;
    String studentMobileNumber;
    int studentAge; 
    String studentEmail; 

    int studentAttendance;
    int studentScore;

    // assuming 5 subjects 
    // Later On New Requirement saying 15 subjects 
    // Problem without Arrays
    int subjectOne;
    int subjectTwo;
    int subjectThree;
    int subjectFour;
    int subjectFive;

    Scanner sc = new Scanner(System.in);

    // Adding Constructor Functionality 
    public Student_Old() {
        System.out.println("Default Constructor");
    }

    // Hover Functionality With Constructor
    public Student_Old(int studentID, String studentName) {
        // this.studentID = studentID;
        // this.studentName = studentName;
        // this();
        this(101, "John", "8889996661", 22, "john@gmail.com");
    }

    // Click Functionality With Constructor
    public Student_Old(int studentID, String studentName, String studentMobileNumber, int studentAge, String studentEmail) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentMobileNumber = studentMobileNumber;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
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
        System.out.println("Enter Scores For Subjects: ");
        subjectOne = sc.nextInt();
        subjectTwo = sc.nextInt();
        subjectThree = sc.nextInt();
        subjectFour = sc.nextInt();
        subjectFive = sc.nextInt();

        int averageScore = (subjectOne + subjectTwo + subjectThree + subjectFour + subjectFive) / 5;
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