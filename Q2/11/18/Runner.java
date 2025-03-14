public class Runner{
    public static void main(String[] args){
        int[] array = new int[5];
        for(int i = 0; i<array.length; i++){
            array[i] = (int) (Math.random() * 5 + 1);
        }
        Test t = new Test();
        t.print(array);
        int find = t.find(array, 3);
        int sum = t.getSummation(array);
        int small = t.getSmallest(array);
        System.out.println("find result: " + find);
        System.out.println("sum result: " + sum);
        System.out.println("smallest result: " + small);
    }
}