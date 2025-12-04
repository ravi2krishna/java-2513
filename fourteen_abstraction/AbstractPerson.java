package fourteen_abstraction;

// shared attributes for all persons
public abstract class AbstractPerson {

    // Common Attributes
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

}
