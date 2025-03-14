public class ArrayTest{
    private int[] numbers;
    public ArrayTest(int input){
        numbers = new int[input];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = (int) (Math.random() * 9 + 1);
        }
    }
    public void print(){
        for(int each : numbers){
            System.out.println(each);
        }
    }
    public int getSum(){
        int total = 0;
        for (int i = 0; i<numbers.length; i++){
            total = total + numbers[i];
        }
        return total;
    }
    public int getLargest(){
        int largest = 0;
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
}