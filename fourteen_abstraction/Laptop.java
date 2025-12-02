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

}
