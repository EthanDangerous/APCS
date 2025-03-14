public class Runner{
    public static void main(String[] args){
        ForLoop fl = new ForLoop();
        fl.count(1, 5);
        fl.count(7, 3);
        int sum = fl.sum(5);
        System.out.println(sum);
    }
}