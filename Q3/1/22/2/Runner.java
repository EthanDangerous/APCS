import java.util.Scanner;

public class Runner {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayTest at = new ArrayTest();

        int[] nums = new int[10];

        for(int i = 0; i<10; i++){
            nums[i] = (int) (Math.random() * 10 + 1);
        }

        at.printArray(nums);
        at.scramble(nums);
        at.printArray(nums);
        System.out.println("Please enter a number: \n");
        int scan = sc.nextInt();
        int search = at.search(scan, nums);
        System.out.println(search + "\n");
        at.sort(nums);
        at.printArray(nums);
    }
}
