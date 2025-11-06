package seven_oops_basics;

public class CarFactory {
    public static void main(String[] args) {
        
        // ClassName objectName = new ClassName();
        CarNavigator tataPunch = new CarNavigator();

        tataPunch.displayCarInfo();

        // assign data to object 
        tataPunch.carBrand = "TATA";
        tataPunch.carModel = "Punch";
        tataPunch.carPrice = 5.3;
        tataPunch.carColor = "Green";

        // calling behaviors
        tataPunch.displayCarInfo();

        // calling behaviors
        tataPunch.displayOffers();

        // ClassName objectName = new ClassName();
        CarNavigator hyundaiVenue = new CarNavigator();

        // assign data to object 
        hyundaiVenue.carBrand = "HYUNDAI";
        hyundaiVenue.carModel = "Venue";
        hyundaiVenue.carPrice = 7.9;
        hyundaiVenue.carColor = "Blue";

        // calling behaviors
        hyundaiVenue.displayCarInfo();

        // calling behaviors
        hyundaiVenue.displayOffers();

    }
}
