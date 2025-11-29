package twelve_inheritance;

public class LMS {
    
    // static variable
    public static String instituteName = "Edify";

    public static void main(String[] args) {

        // Student with hover 
        Student s1 = new Student(101, "John");
        
        // Student with click
        Student s2 = new Student(102, "Mike", "9988998800", 20, "mike@gmail.com",30000);

        // Institute Details 
        Student.instituteInfo();
        
        // show student basic details - hover
        s1.personBasicInfo();
        
        // show student complete details - click 
        s2.personCompleteInfo();

        // student achievement 
        s1.finalAchievement();

        // Course Fee Calculation
        s2.calculateCourseFee();

        // Trainer 
        Trainer t1 = new Trainer(201, "Ravi", "9988998800", 20, "ravi@gmail.com");

        // show trainer basic details - hover
        s1.personBasicInfo();

        // show trainer complete details - click 
        t1.personCompleteInfo();

        // trainer payment 
        t1.calculatePayment();

    }

}
