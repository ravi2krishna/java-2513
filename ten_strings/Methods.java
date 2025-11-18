package ten_strings;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        
        // Simulate Gmail Functionality 
        // rAvI2KRIshna -> ravi2krishna@gmail.com [ Text Transformations ]
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email ID: ");
        String email = sc.next();
        String transformedEmail = email.toLowerCase();
        System.out.println("Original ID: "+email);
        System.out.println("Transformed ID: "+transformedEmail);
        System.out.println("Transformed ID: "+transformedEmail.concat("@gmail.com"));

        // Simulate PAN Functionality 
        // https://www.pan.utiitsl.com/panonline_ipg/forms/csfPan.html/csfPreForm
        System.out.println("Enter PAN ID: ");
        String pan = sc.next();
        String transformedPAN = pan.toUpperCase();
        System.out.println("Original ID: "+pan);
        System.out.println("Transformed ID: "+transformedPAN);

        // Simulate Password Change Functionality 
        // https://phppot.com/wp-content/uploads/2013/09/password-change-script-550x402.jpg
        
        System.out.println("Enter Password: ");
        String password = sc.next();
        System.out.println("Reenter Same Password: ");
        String passwordNew = sc.next();

        if (password.equals(passwordNew)) {
            System.out.println("Password Changed Successfully");
        } else {
            System.out.println("Password Didn't Match, Try Again");
        }

        // Simulate Email Validation -> should contain @ and . 
        System.out.println("Enter Email ID: ");
        String emailValidation = sc.next();
        if (emailValidation.contains("@") && emailValidation.contains(".")) {
            System.out.println("Given Email is Valid: "+emailValidation);
        } else {
            System.out.println("Given Email is InValid: "+emailValidation);
        }

        // Phone ISD Scenario
        // https://us1.discourse-cdn.com/flex016/uploads/weweb/original/2X/d/dbe25afb4aeb05640347e2f7c1b7ae532ebb28f2.png

        System.out.println("Enter Phone Number With ISD Code: ");
        String phoneNumber = sc.next();

        if (phoneNumber.startsWith("+91")) {
            System.out.println("Calling India Number Charged In Rupees");
        } else if (phoneNumber.startsWith("+1")) {
            System.out.println("Calling USA Number Charged In Dollars");
        } else if (phoneNumber.startsWith("+33")) {
            System.out.println("Calling France Number Charged In Euros");
        } else {
            System.out.println("Calling Supported Only To India, USA & France");
        }

        // Email Synchronization 
        System.out.println("Enter Source Email ID: ");
        String sourceEmail = sc.next();

        System.out.println("Enter Destination Email ID: ");
        String destinationEmail = sc.next();

        if (sourceEmail.endsWith("@gmail.com") && destinationEmail.endsWith("@gmail.com")) {
            System.out.println("Email Synchronization Started");
        } else {
            System.out.println("Email Synchronization Failed, Both Providers Should Be Same");
        }

    }

}
