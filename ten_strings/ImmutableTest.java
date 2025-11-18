package ten_strings;

public class ImmutableTest {

    public static void main(String[] args) {
        
        // String Immutability 
        String str = "hell"; // it should hello
        System.out.println("With Strings");
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str.concat("o")));
        System.out.println(System.identityHashCode(str));

        System.out.println(str);
        System.out.println(str.concat("o"));
        System.out.println(str);

        // String Performance Issues when doing lots of string modifications 
        long startTimeString = System.currentTimeMillis();
        String st = "Good ";
        for (int i = 0; i < 10000; i++) {
            st = st.concat("Morning");
        }
        long endTimeString = System.currentTimeMillis();
        System.out.println("Time Taken By Strings: " +(endTimeString-startTimeString));


    }

}
