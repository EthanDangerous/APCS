public class Runner{
    public static void main(String[] args){
        ForTest2 ft2 = new ForTest2();
        ft2.printCount1(3, 10);
        int var1 = ft2.getSum1(5);
        System.out.println(var1);
        ft2.printCount2(3, 10);
        int var2 = ft2.getSum2(5);
        System.out.println(var2);
    }
}