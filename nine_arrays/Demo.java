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

        // Multi Dimensional Arrays 
        // Declaration and initialization with fixed sizes
        int[][] matrix = new int[3][4]; // A 3x4 matrix (3 rows, 4 columns)
        
        // data assigning is done using index 
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        // data accessing is done using index  
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][2]);

        // System.out.println(matrix[0][10]); // java.lang.ArrayIndexOutOfBoundsException

        // Declaration and initialization with values at creation
        int[][] md_numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(md_numbers[1][0]);
        System.out.println(md_numbers[1][1]);

        // changing/modifying data is done using index 
        md_numbers[1][0] = 6;
        md_numbers[1][1] = 5;
        md_numbers[1][2] = 4;

        System.out.println(md_numbers[1][0]);
        System.out.println(md_numbers[1][1]);

        // access all elements 
        System.out.print(md_numbers[0][0]);
        System.out.print(md_numbers[0][1]);
        System.out.print(md_numbers[0][2]);
        System.out.println();
        System.out.print(md_numbers[1][0]);
        System.out.print(md_numbers[1][1]);
        System.out.print(md_numbers[1][2]);
        System.out.println();
        System.out.print(md_numbers[2][0]);
        System.out.print(md_numbers[2][1]);
        System.out.print(md_numbers[2][2]);
        System.out.println();
        System.out.println("==============");

        // length 
        System.out.println(md_numbers.length);

        // Iterating Through Arrays 
        // say we got 100 values, then it will be simple 
        for (int i = 0; i < md_numbers.length; i++) {
            // System.out.println(md_numbers[i]);
            System.out.println();
            int [] data = md_numbers[i];
            for (int j = 0; j < data.length; j++) {
                System.out.print(data[j]);
            }
        }
        
    }

}
