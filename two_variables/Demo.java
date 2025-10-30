package two_variables;

public class Demo {

    static int unknownNumber;
    
    public static void main(String[] args) {

        // identifiers
        int num = 10;
        int num2 = 10;
        int num_ = 10;
        int num$ = 10;

        // int 2day = 30; // cannot start with digit
        int _day = 30;
        int $day = 30;

        // int class = 10; // class is keyword

        // improper way of using identifiers 
        String x = "Ravi";
        int y = 20;
        double z = 9.5;

        // proper way of using identifiers 
        String studentName = "Ravi";
        int studentAge = 20;
        double studentGPA = 9.5;


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
