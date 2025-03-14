import java.util.Scanner;

public class MathLibraryRunner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MathLibrary math = new MathLibrary();
        System.out.println("What is the radius?");
        double radiusIn = sc.nextDouble();
        double area = math.areaCircle(radiusIn);
        System.out.println(area);
        System.out.println("What is the radius?");
        radiusIn = sc.nextDouble();
        System.out.println("What is the height?");
        double heightIn = sc.nextDouble();
        double volume = math.volCylinder(radiusIn, heightIn);
        System.out.println(volume);
        volume = math.volCone(radiusIn, heightIn);
        System.out.println(volume);
    }
}
//return types are useful because it makes things a little more compact and simple
//no. only one at a time
//