package six_loops;

public class Branching {

    // sample test method for checking return
    public static int addNumbers(int a, int b) {
        return a + b;
        // int kl = 10; // unreachable code
    }

    public static void main(String[] args) {
        
        // without break & continue
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        // with break
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                break; // terminate loop
            }
            System.out.println(i);
        }

        // with continue
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue; // skip this iteration
            }
            System.out.println(i);
        }

        // calling method
        System.out.println("Sum Of Numbers "+addNumbers(10, 20));

    }
}
