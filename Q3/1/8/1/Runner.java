public class Runner{
    public static void main(String[] args){
        Review rev = new Review(5);
        rev.printArray();
        int largest = rev.getLargest();
        System.out.println("largest: " + largest);
    }
}
