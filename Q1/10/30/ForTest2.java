public class ForTest2{
    public void printCount1(int num1, int num2){
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }
    public void printCount2(int num1, int num2){
        int count = num1 - 1;
        while(count<num2){
            count++;
            System.out.println(count);
        }
    }
    public int getSum1(int num1){
        int total = 0;
        for(int i = 1; i <= num1; i++){
            total += i;
            System.out.println(i);
        }
        return total;
    }
    public int getSum2(int num1){
        int total = 0;
        int count = 0;
        while (count<num1){
            count++;
            total += count;
            System.out.println(count);
        }
        return total;
    }
}