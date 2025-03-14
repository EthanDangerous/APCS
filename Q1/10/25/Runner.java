public class Runner{
    public static void main(String[] args){
        MathTest mt = new MathTest();
        mt.countUp(15);
        mt.countDown(15);
        int result = mt.getSum(5);
        System.out.println(result);
    }
}