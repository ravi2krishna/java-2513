package ten_strings;

public class LMS {
    
    // static variable
    public static String instituteName = "Edify";

    public static void main(String[] args) {

        // Student with hover 
        Student s1 = new Student(101, "John");
        
        // Student with click
        Student s2 = new Student(102, "Mike", "9988998800", 20, "mike@gmail.com",30000);

        // show student basic details - hover
        s1.studentBasicInfo();
        
        // show student complete details - click 
        s2.studentCompleteInfo();

        // student achievement 
        s1.finalAchievement();

        // Course Fee Calculation
        s2.calculateCourseFee();

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
