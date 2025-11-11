package eight_constructors;

public class Demo {
    
    // instance data 
    int number;
    double decimalNumber;
    String data;
    char ch;

    // default constructor -> assign you custom default values 
    public Demo() {
        System.out.println("Default Constructor");
        System.out.println("Using Constructor Setting custom default values ");
        number = 1;
        decimalNumber = 3.5;
        data = "welcome";
        ch = '$';
    }

    // parametrized constructor -> assign you custom values 
    public Demo(int intValue, String stringValue) {
        number = intValue;
        data = stringValue;
    }

    
    public static void main(String[] args) {
        
        Demo obj = new Demo();

        // access data 
        System.out.println("======================");
        System.out.println("With Constructors");
        System.out.println("======================");
        System.out.println(obj.number);
        System.out.println(obj.decimalNumber);
        System.out.println(obj.data);
        System.out.println(obj.ch);

        Demo objOne = new Demo();
        System.out.println(objOne.number);
        System.out.println(objOne.decimalNumber);
        System.out.println(objOne.data);
        System.out.println(objOne.ch);

        System.out.println("======================");

        Demo objTwo = new Demo(2,"good morning");
        System.out.println(objTwo.number);
        System.out.println(objTwo.data);
        System.out.println(objTwo.decimalNumber);

        System.out.println("======================");

        Demo objThree = new Demo(3,"good night");
        System.out.println(objThree.number);
        System.out.println(objThree.data);
        System.out.println(objThree.decimalNumber);

    }


}
