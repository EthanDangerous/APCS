public class Runner {
    public static void main(String[] args){
        ArrayTest at = new ArrayTest();
        at.printNumArray();
        at.swapNumArray(0, 9);
        at.printNumArray();
        at.printStringArray();
        at.swapStringArray(1, 2);
        at.printStringArray();
        int search = at.searchString("dog");
        System.out.println(search);
        int count1 = at.countLetter('e');
        int count2 = at.countLetter('a');
        System.out.println(count1);
        System.out.println(count2);
    }
}
