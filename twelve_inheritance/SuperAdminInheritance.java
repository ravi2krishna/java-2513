package twelve_inheritance;

public class SuperAdminInheritance extends VideoAdminInheritance {

    // super admin can watch videos and also update videos, and delete videos
    // watch video is coming from Learner 
    
    // add/update video is coming from VideoAdminInherit

    // delete video
    public void deleteVideos(){
        System.out.println("D");
        System.out.println("e");
        System.out.println("l");
        System.out.println("e");
        System.out.println("t");
        System.out.println("e");
        System.out.println("v");
        System.out.println("i");
        System.out.println("d");
        System.out.println("e");
        System.out.println("o");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
    }

    public static void main(String[] args) {
        SuperAdminInheritance obj = new SuperAdminInheritance();
        obj.watchVideos();
        obj.addVideos();
        obj.deleteVideos();        
    }

}
