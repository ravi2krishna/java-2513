package two_variables;

public class Demo {

    static int unknownNumber;
    
    public static void main(String[] args) {

        // number = 10; // incorrect way of defining variables 
        // text = hello; // incorrect way of defining variables 
          
        // Assign (Store Data)
        // datatype variable_name = value;
        int number = 10;

        String brand = "OFF LIMITS";
        double ratings = 4.4;
        int size = 7;

        // Retrieve Data -> System.out.println(variable);
        System.out.println(number);
        System.out.println(brand);
        System.out.println(ratings);
        System.out.println(size);

        // output data for better readability
        // concatenation
        String s1 = "Good";
        String s2 = "Morning";
        System.out.println(s1 + s2);
        System.out.println("Great"+s2);

        System.out.println("Number is "+number);
        System.out.println("Brand is "+brand);
        System.out.println("Rating is "+ratings);
        System.out.println("Size is "+size);

        // variable special case inside methods
        // int unknownNumber;
        // System.out.println("What is Unknown Value "+unknownNumber); 
        // "The local variable unknownNumber may not have been initialized",
        System.out.println("What is Unknown Value "+unknownNumber); 
    }

}
