package seven_oops_basics;

public class Methods {
    
    // case 1
    public void welcomeMessage() {
        System.out.println("==================================");
        System.out.println("Welcome To Simple Calculator");
        System.out.println("==================================");
    }

    // case 2 
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.welcomeMessage();
        System.out.println("Sum Of Numbers: "+obj.addNumbers(10, 20));
        System.out.println("Product Of Numbers: "+obj.multiplyNumbers(30,40));
    }

}
