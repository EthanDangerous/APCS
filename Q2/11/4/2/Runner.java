import java.util.Scanner;

public class Runner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rand = 0;
        int rand2 = 0;
        for(int i = 0; i <= 5; i++){
            rand = (int) (Math.random() * 20);
            System.out.println(rand);
        }
        System.out.println("");
        for(int i = 0; i <= 5; i++){
            rand = (int) (Math.random() * 6 + 5);
            System.out.println(rand);
        }
        System.out.println("");   
        for(int i = 0; i <= 5; i++){
            rand = (int) (Math.random() * 36 + 15);
            System.out.println(rand);
        }
        System.out.println("give me a number greater than 10");
        int num = sc.nextInt();
        for(int i = 0; i <= 5; i++){
            rand = (int) (Math.random() * num + 1);
            System.out.println(rand);
        }
        for(int i = 0; i <= 10; i++){
            rand = (int) (Math.random() * 6 + 1);
            System.out.println(rand);
            rand2 = (int) (Math.random() * 6 + 1);
            System.out.println(rand2);
            if(rand==1 && rand2==1){
                System.out.println("Snake eyes");
            }
            if(rand == rand2){
                System.out.println("Same");
            }
            int sum = rand + rand2;
            if(sum % 2 == 0){
                System.out.println("Even sum");
            }
        }
    }
}
// use case it to make a random password
// reason is to make certain aspects of code different each time it is run
