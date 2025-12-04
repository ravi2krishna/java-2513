package fourteen_abstraction;

public class LMS {
    
    // static variable
    public static String instituteName = "Edify";

    public static void main(String[] args) {

        // Student Data 
        Personable s1 = new Student();

        // Institute Details 
        Student.instituteInfo();

        // call set student details
        s1.setPersonDetails();
        
        // show student complete details - click 
        s1.displayPersonDetails();

        // student achievement 
        s1.finalAchievement();

        // Course Fee Calculation
        ((Payables)s1).calculatePayment();

        // Trainer 
        Personable t1 = new Trainer();

        // call set trainer details
        t1.setPersonDetails();

        // show trainer complete details - click 
        t1.displayPersonDetails();

        // trainer payment 
        ((Payables)t1).calculatePayment();

    }

}
