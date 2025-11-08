package seven_oops_basics;

public class Variables {
    
    // instance variables 
    String carBrand;
    String carModel;
    double carPrice;
    String carColor;

    // static variables
    static String webSite = "Car Dekho";

    // instance method 
    public void displayCarInfo() {
        
        // Local Variable carRating 
        double carRating = 4.5;
        // double carRating; // The local variable carRating may not have been initialized

        System.out.println("Car Brand: "+carBrand);
        System.out.println("Car Model: "+carModel);
        System.out.println("Car Price: "+carPrice);
        System.out.println("Car Color: "+carColor);
        System.out.println("Car Rating: "+carRating);
    }

    public static void main(String[] args) {
        
        Variables tataPunch = new Variables();
        
        tataPunch.displayCarInfo();
        
        // assign data to object 
        tataPunch.carBrand = "TATA";
        tataPunch.carModel = "Punch";
        tataPunch.carPrice = 5.3;
        tataPunch.carColor = "Green";

        // accessing static data using ClassName 
        System.out.println("Welcome To: "+Variables.webSite);

        // calling behaviors
        tataPunch.displayCarInfo();

        Variables bmwX1 = new Variables();

        // assign data to object 
        bmwX1.carBrand = "BMW";
        bmwX1.carModel = "X1";
        bmwX1.carPrice = 45.3;
        bmwX1.carColor = "Black";

        // calling behaviors
        bmwX1.displayCarInfo();

    }

}
