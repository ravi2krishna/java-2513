package three_datatypes;

public class Demo {
    public static void main(String[] args) {
        
        // data types 
        byte byteValue = 9;
        short shortValue = 99;
        int intValue = 99999;
        // long longValue = 99999999999999999; without l
        long longValue = 99999999999999999l;

        System.out.println("Byte: "+byteValue);
        System.out.println("Short: "+shortValue);
        System.out.println("Int: "+intValue);
        System.out.println("Long: "+longValue);

        // float floatValue = 3.14; without f
        float floatValue = 3.14f;
        double doubleValue = 32.9909089;
        System.out.println("Float: "+floatValue);
        System.out.println("Double: "+doubleValue);

        char charValue = '$';
        System.out.println("Char: "+charValue);

        boolean booleanValue = true;
        System.out.println("Boolean: "+booleanValue);

        // Non-Primitive 
        String studentName = "Ravi";
        int [] idsStudents = {101,102,103,104,105};

        System.out.println("Name: "+studentName);
        System.out.println("IDS: "+idsStudents);

    }
}
