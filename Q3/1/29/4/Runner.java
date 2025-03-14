public class Runner {
    public static void main(String[] args){
        Test t = new Test();
        t.printList();
        int search = t.searchLargest();
        System.out.println(search);
        t.searchAndReplace(5);
        t.printList();
        t.searchAndRemove(2);
        t.printList();
        t.sort();
        t.printList();
    }
}
