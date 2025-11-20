package eleven_static;

public class Demo {

    // static variable 
    public static String data;

    // instance variable 
    public String value;

    // static block 
    static {
        System.out.println("Static Block Executed");
        data = "Java Static";
    }

    // instance block 
    {
        System.out.println("Instance Block Executed");
        value = "Ravi Name";
    }

    // constructor 
    public Demo() {
        System.out.println("Constructor Executed");    
    }

    // static method 
    public static void accessData(){
        System.out.println("Access Static Data: "+data);      // directly also we can access
        System.out.println("Access Static Data: "+Demo.data); // using class name 
        // System.out.println("Access Instance Data: "+value); // cannot access instance data 
        // accessValue(); cannot access instance methods 
    }

    // instance method 
    public void accessValue(){
        System.out.println("Access Static Data: "+data);      // access static data inside instance methods
        System.out.println("Access Static Data: "+Demo.data); // using class name 
        accessData();  // accessing static method
        System.out.println("Access Instance Data: "+value);
        
    }

    public static void main(String[] args) {
        // local variable 
        String info = "Hello";
        System.out.println("Main Method Executed");

        Demo d1 = new Demo();
        System.out.println(d1.value);

        accessData(); // valid 
        Demo.accessData(); // valid 

        d1.accessValue();
        d1.accessData(); // works but not recommended 

    }

}
