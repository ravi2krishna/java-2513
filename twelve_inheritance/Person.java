package twelve_inheritance;

// This will be parent class for all types of persons 
// Student, Trainer etc 
public class Person {

    // Common Attributes 
    int personID;
    String personName;
    String personMobileNumber;
    int personAge; 
    String personEmail; 

    // Constructors 
    public Person() {

    }

    public Person(int personID, String personName, String personMobileNumber, int personAge, String personEmail) {
        this.personID = personID;
        this.personName = personName;
        this.personMobileNumber = personMobileNumber;
        this.personAge = personAge;
        this.personEmail = personEmail;
    }

    // Display Basic Info
    public void personBasicInfo(){

        System.out.println("==================================");
        System.out.println("    Welcome To "+LMS.instituteName);
        System.out.println("==================================");

        System.out.println("======= When Hovering =======");
        System.out.println("ID: "+personID);
        System.out.println("Name: "+personName);
    }


    // Display Complete Info
    public void personCompleteInfo(){

        System.out.println("==================================");
        System.out.println("    Welcome To "+LMS.instituteName);
        System.out.println("==================================");

        System.out.println("======= When Clicking =======");
        System.out.println("ID: "+personID);
        System.out.println("Name: "+personName);
        System.out.println("Mobile: "+personMobileNumber);
        System.out.println("Age: "+personAge);
        System.out.println("Email: "+personEmail);
    }

}
