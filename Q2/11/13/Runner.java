public class Runner{
    public static void main(String[] args){
        ArrayTest at = new ArrayTest(10);
        at.print();
        boolean search = at.search(5);
        System.out.println("Result: " + search);
        search = at.search(9);
        System.out.println("Result: " + search);
    }
}