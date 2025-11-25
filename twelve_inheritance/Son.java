package twelve_inheritance;

// Multi Level Inheritance 
public class Son extends Father {

    public void hasCar() {
        System.out.println("Has Car");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.hasCar();
        son.hasHouse();
        son.hasLand();
    }

}
