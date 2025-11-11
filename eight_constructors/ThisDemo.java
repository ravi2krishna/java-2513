package eight_constructors;

public class ThisDemo {
    
    // instance data 
    int x;
    int y;

    public ThisDemo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int addNumbers() {
        return x + y;
    }

    public static void main(String[] args) {
        
        ThisDemo obj = new ThisDemo(100, 200);
        System.out.println("Sum is: "+obj.addNumbers());

    }

}
