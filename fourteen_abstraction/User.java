package fourteen_abstraction;

public class User {

    public static void main(String[] args) {
        
        Dell dell = new Dell();
        dell.processorLogic();
        dell.ramLogic();
        dell.hddLogic();
        dell.wifiLogic();
        dell.screenLogic();
        dell.keypadLogic();
        dell.trackpadLogic();
        Laptop.greet();

        // HP hp = new HP(); // Cannot instantiate the type HP

        // Hiding Implementation -> Interface, helped achieve abstraction
        // Lenovo lenovo = new Lenovo();
        Laptop lenovo = new Lenovo();
        lenovo.processorLogic();
        lenovo.ramLogic();
        lenovo.hddLogic();

    }

}
