package fourteen_abstraction;

// contract for persons like Students, Trainers, Mentors, Admins etc
public interface Personable {

    // abstract methods -> contracts 
    public void setPersonDetails();

    public void displayPersonDetails();

    default void finalAchievement() {
        
    }

}
