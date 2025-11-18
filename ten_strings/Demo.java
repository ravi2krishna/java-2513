package ten_strings;

public class Demo {

    public static void main(String[] args) {
        
        int i = 10;
        
        // Demo d1 = 200;
        // Demo d1 = "hello";

        String name = "Ravi";

        // checking object address of non-primitive data type 
        Demo d1 = new Demo();
        System.out.println(d1); 

        // checking object address of non-primitive data type with string
        String s1 = new String();
        System.out.println(s1); 

        // Understanding String Memory Pool Concept 
        String str1 = "hello";
        String str2 = "hello";

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2); // == with strings we compare objects 

        String str3 = new String("hello"); 
        String str4 = new String("hello"); 

        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1 == str3);
        System.out.println(str4 == str3);

        System.out.println(str1.equals(str3));
        System.out.println(str4.equals(str3));

    }

}
