package encap;

import thirteen_encapsulation.DemoPerson;

public class SubClassTest extends DemoPerson {

    public static void main(String[] args) {
        
        SubClassTest obj = new SubClassTest();
        
        System.out.println("Different Package - Sub Class");
        System.out.println(obj.publicName);
        System.out.println(obj.protectedName);
        // System.out.println(obj.defaultName); // not visible or accessible 
        // System.out.println(obj.privateName); // not visible or accessible 

    }

}
