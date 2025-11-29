package thirteen_encapsulation;

public class DemoPersonSamePackage {

    public static void main(String[] args) {
        
        DemoPerson dp = new DemoPerson();
        System.out.println("Same Package - Different Class");
        System.out.println(dp.publicName);
        System.out.println(dp.protectedName);
        System.out.println(dp.defaultName);
        // System.out.println(dp.privateName); // not visible or accessible 

    }

}
