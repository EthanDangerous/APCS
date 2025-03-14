import java.util.Scanner;

public class MathRunner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter and interger:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        System.out.println("enter in abc seperated by a space");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double x1 = (-b + Math.sqrt( Math.pow(b, 2) - 4.0*a*c )) / (2.0*a);
        double x2 = (-b - Math.sqrt( Math.pow(b, 2) - 4.0*a*c )) / (2.0*a);
        System.out.println("Answer 1: "+x1);
        System.out.println("Answer 2: "+x2);
    }
}