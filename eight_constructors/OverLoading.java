package eight_constructors;

public class OverLoading {

    public OverLoading(int a, int b) {
        System.out.println("Sum is: "+(a+b));
    }

    public OverLoading(int a, int b, int c) {
        System.out.println("Sum is: "+(a+b+c));
    }

    public OverLoading(double a, int b) {
        System.out.println("Sum is: "+(a+b));
    }

    public OverLoading(int a, double b) {
        System.out.println("Sum is: "+(a+b));
    }

    public static void main(String[] args) {
        
        OverLoading o1 = new OverLoading(1,2,3);
        OverLoading o2 = new OverLoading(1,2.2);

    }
    
}