public class Runner{
    public static void main(String[] args){
        int[] array = new int[5];
        for(int i = 0; i<array.length; i++){
            array[i] = (int) (Math.random() * 5 + 1);
        }
        Test ts = new Test();
        ts.print(array);
        boolean contains = ts.contains(array, 3);
        int product = ts.getProduct(array);
        int largest = ts.getLargest(array);
        System.out.println(contains);
        System.out.println(product);
        System.out.println(largest);
    }
}