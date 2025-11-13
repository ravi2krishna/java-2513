package nine_arrays;

public class Demo {
    
    public static void main(String[] args) {
        
        // simple data type
        int number=10;
        System.out.println(number);

        // Declares an array named 'numbers' that can hold 5 integers.
        int[] numbers = new int[5]; 
        System.out.println(numbers);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // data assigning is done using index 
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // data accessing is done using index  
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // numbers[10] = 100; //java.lang.ArrayIndexOutOfBoundsException
        
        // Declares and initializes an array of numbers.
        double[] ratings = {3.5,4.5,2.5,5,4.7};
        System.out.println(ratings[0]);

        // Declares and initializes an array of strings.
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; 
        System.out.println(cars[1]);

        // changing/modifying data is done using index  
        cars[1] = "Mercedes";
        System.out.println(cars[1]);

        
        int [] numbs = {10,20,30,40,50};
        System.out.println(numbs[0]);
        System.out.println(numbs[1]);
        System.out.println(numbs[2]);
        System.out.println(numbs[3]);
        System.out.println(numbs[4]);

        // say we got 100 values, then it will be complex 
        
        System.out.println("Length/Size Of Array: "+numbs.length);

        // Iterating Through Arrays 
        // say we got 100 values, then it will be simple 
        for (int i = 0; i < numbs.length; i++) {
            System.out.println(numbs[i]);
        }
        
        // Enhanced for loop (for-each loop)
        for (int num : numbs) {
            System.out.println(num);
        }

        // perform operations i.e take each element do some operation
        for (int i = 0; i < numbs.length; i++) {
            System.out.println(numbs[i] * 5);
        }

        System.out.println("==========");

        // perform conditions get only even value
        int [] values = {10,25,30,45,50};
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                System.out.println(values[i]);
            }
        }

    }

}
