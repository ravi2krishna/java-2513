package seven_oops_basics;

// blueprint for car navigator functionality 
public class CarNavigator {
    
    // characteristics - properties - variables - attributes
    String carBrand;
    String carModel;
    double carPrice;
    String carColor;

    // like behaviors / actions / methods / functions
    public void displayCarInfo() {
        System.out.println("Car Brand: "+carBrand);
        System.out.println("Car Model: "+carModel);
        System.out.println("Car Price: "+carPrice);
        System.out.println("Car Color: "+carColor);
    }

    // like behaviors / actions / methods / functions
    public void displayOffers(){
        System.out.println("Current Month Offer 50k Off");
        System.out.println("Offer Price: "+(carPrice-0.5));
    }

}
