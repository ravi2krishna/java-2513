package thirteen_encapsulation;

// This will be parent class for all types of persons 
// Student, Trainer etc 
public class Person {

    // Common Attributes
    // implementing Encapsulation
    private int personID;
    private String personName;
    private String personMobileNumber;
    private int personAge; 
    private String personEmail; 

    // implementing Getters & Setters 

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonMobileNumber() {
        return personMobileNumber;
    }

    public void setPersonMobileNumber(String personMobileNumber) {
        this.personMobileNumber = personMobileNumber;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        if (personAge > 0) {
            this.personAge = personAge;
        } else {
            System.out.println("Person Age Should be valid value");
        }
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
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
