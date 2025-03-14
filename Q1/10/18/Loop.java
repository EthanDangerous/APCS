import java.util.Scanner;

public class Loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = 0;
        while(loop<12){
            loop++;
            System.out.println(loop + "\n");
        }
        System.out.println("NEXT PART");
        loop = 4;
        while(loop<31){
            loop++;
            System.out.println(loop + "\n");
        }
        System.out.println("Input and interger less than 10");
        int number = sc.nextInt();
        loop = 51;
        while(loop>number){
            loop--;
            System.out.println(loop);
        }
        System.out.println("Input and interger greater than 1");
        number = sc.nextInt();
        loop = 0;
        int total = 0;
        while(loop<number){
        }
    }
}