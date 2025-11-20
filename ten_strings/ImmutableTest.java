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


        // StringBuffer Mutability  
        StringBuffer strBuffer = new StringBuffer("hell"); // it should hello
        System.out.println("With String Buffer");
        System.out.println(System.identityHashCode(strBuffer));
        System.out.println(System.identityHashCode(strBuffer.append("o")));
        System.out.println(System.identityHashCode(strBuffer));

        // StringBuilder Mutability  
        StringBuilder strBuilder = new StringBuilder("hell"); // it should hello
        System.out.println("With String Builder");
        System.out.println(System.identityHashCode(strBuilder));
        System.out.println(System.identityHashCode(strBuilder.append("o")));
        System.out.println(System.identityHashCode(strBuilder));


        // String Performance Issues when doing lots of string modifications 
        long startTimeString = System.currentTimeMillis();
        String st = "Good ";
        for (int i = 0; i < 10000; i++) {
            st = st.concat("Morning");
        }
        long endTimeString = System.currentTimeMillis();
        System.out.println("Time Taken By Strings: " +(endTimeString-startTimeString));


        // String Mutability -> StringBuffer & StringBuilder

        // StringBuilder
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Good ");
        for (int i = 0; i < 10000; i++) {
            builder = builder.append("Morning");
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        System.out.println("Time Taken By String Builder: " +(endTimeStringBuilder-startTimeStringBuilder));

        // StringBuffer
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Good ");
        for (int i = 0; i < 10000; i++) {
            buffer = buffer.append("Morning");
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        System.out.println("Time Taken By String Builder: " +(endTimeStringBuffer-startTimeStringBuffer));


    }

}
