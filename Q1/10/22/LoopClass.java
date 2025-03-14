import java.util.Scanner;

public class LoopClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = 6;
        while (loop < 30) {
            loop++;
            loop++;
            System.out.println(loop);
        }
        loop = 6;
        do { 
            loop = loop + 2;
            System.out.println(loop);
        } while (loop<30);
        int total = 0;
        loop = 1;
        while(loop<19){
            loop++;
            System.out.println(loop);
            total = total + loop;
        }
        System.out.println(total);
        System.out.println("Input a integer.");
        int input = sc.nextInt();
        if(input){
            
        }
    }
}