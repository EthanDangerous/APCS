
public class Runner{
    public static void main(String[] args){
        Profile p1 = new Profile();
        Profile p2 = new Profile("David", 16);
        //p1.Profile();
        //p1.printInfo();
        //p1.Profile("David", 16);
        p1.printInfo();
        p2.printInfo();
    }
}