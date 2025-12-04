package fourteen_abstraction;

public abstract class HP implements Laptop {

    public void processorLogic() {
        System.out.println("i5 Processor");
    }

    public void ramLogic(){
        System.out.println("8 GB RAM");
    }
    public void hddLogic() {
        System.out.println("500 GB HDD");
    }
    public void wifiLogic() {
        System.out.println("Wifi Connected");
    }
    public void screenLogic() {
        System.out.println("15.6 Inch Full HD Screen");
    }
    public void keypadLogic() {
        System.out.println("Full Size Keyboard");
    }
    public void trackpadLogic() {
        System.out.println("Touch Pad With Gestures");
    }

    // abstract method
    public abstract void hpSpecialMethod();

}
