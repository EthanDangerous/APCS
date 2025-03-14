public class Runner{
    public static void main(String[] args){
        ArrayTest at = new ArrayTest(4);
        at.print();
        int sum = at.getSum();
        int largest = at.getLargest();
        System.out.println("sum = "+sum);
        System.out.println("largest = "+largest);
    }
}