package seven_oops_basics;

import java.util.Scanner;

// student blueprint 
public class Student {

    // instance variables 
    int studentID;
    String studentName;
    int studentAttendance;
    int studentScore;

    // method to display student info 
    public void studentInfo(){

        System.out.println("==================================");
        System.out.println("    Welcome To "+LMS.instituteName);
        System.out.println("==================================");

        System.out.println("======= Details =======");
        System.out.println("ID: "+studentID);
        System.out.println("Name: "+studentName);
    }

    // method to calculate attendance credits
    public int attendanceCredits(){
        Scanner sc = new Scanner(System.in);
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

    // method to calculate score credits
    public int scoreCredits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Score: ");
        // local variable
        int score = sc.nextInt();

        if (score >=85) {
            return 5;
        } else if (score >=60) {
            return 3;
        } else {
            return 0;
        }
    }

    // method to calculate award status 
    public void finalAchievement(){
        // local variable
        int finalCredits = attendanceCredits() + scoreCredits();

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Trainer Rating");
        int trainerRating = sc.nextInt();
        
        if (trainerRating>=5) {
            return 5000;
        } else {
            return 0;
        }
    }
    
}