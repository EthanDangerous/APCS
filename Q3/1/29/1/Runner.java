public class Runner {
    public static void main(String[] args){
        ArrayTest at = new ArrayTest(5);
        at.printArray();
        at.scramble();
        at.printArray();
        int search = at.search(0);
        System.out.println(search + "\n");
        at.sort();
        at.printArray();
    }
}
