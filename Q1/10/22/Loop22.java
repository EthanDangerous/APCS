import java.util.Scanner;

public class Loop22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number from 10-15. No decimals.");
        int numIn = sc.nextInt();
        int loop = 0;
        while(loop < numIn){
            loop ++;
            System.out.println(loop);
        }
        loop = 31;
        System.out.println(" ");
        while(loop > numIn){
            loop --;
            System.out.println(loop);
        }
    }
}