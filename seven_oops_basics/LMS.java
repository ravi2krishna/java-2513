package seven_oops_basics;

public class LMS {
    
    // static variable
    public static String instituteName = "Edify";

    public static void main(String[] args) {

        // Student 
        Student s1 = new Student();
        s1.studentID = 101;
        s1.studentName = "John";

        // 

        // show student details
        s1.studentInfo();

        // student achievement 
        s1.finalAchievement();

        // Trainer 
        Trainer t1 = new Trainer();
        t1.trainerID = 501;
        t1.trainerName = "Ravi";

        // show trainer details
        t1.trainerInfo();

        // trainer payment 
        t1.calculatePayment();

    }

}
