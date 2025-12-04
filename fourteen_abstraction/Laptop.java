package fourteen_abstraction;

public interface Laptop {

    // only constants 
    final static String LAPTOP_CODE = "LAPTOP-2025";

    // To Manufacture Laptops 
    // Below are contracts everyone should bind by 
    
    // abstract methods --> govt mandates below components are must 
    public void processorLogic();
    public void ramLogic();
    public void hddLogic();
    public void wifiLogic();
    public void screenLogic();
    public void keypadLogic();
    public void trackpadLogic();
    // public void bioMetricLogin();

    // adding new contract with implementation
    // public void bioMetricLogin() {

    // }

    // adding new contract with implementation -> using default
    default void bioMetricLogin() {
        helperMethod(); // Calling the private method
        System.out.println("Providing Govt Bio Metric");
    }

    // static method belonging to interface
    static void greet() {
        
        System.out.println("Hello from MyInterface!");
    }

    private void helperMethod() {
        System.out.println("This is a private helper.");
    }


}
