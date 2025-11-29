package encap;

import thirteen_encapsulation.DemoPerson;

public class OtherPackageTest {

    public static void main(String[] args) {
        
        DemoPerson obj = new DemoPerson();
        
        System.out.println("Different Package - Non-Sub Class");
        System.out.println(obj.publicName);
        System.out.println(obj.protectedName);
        System.out.println(obj.defaultName); // not visible or accessible 
        System.out.println(obj.privateName); // not visible or accessible 

    }

}
