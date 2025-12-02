package thirteen_encapsulation;

public class TeacherBk {

    public static void main(String[] args) {
        
        NewStudentPrivate obj = new NewStudentPrivate();
        obj.setAge(15);
        System.out.println("Student Age: "+obj.getAge());

        obj.setAge(-20);
        System.out.println("Student Age: "+obj.getAge());

    }

}
