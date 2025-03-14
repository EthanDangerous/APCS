public class ArrayTest{
    private int[] numbers;
    public ArrayTest(int size){
        numbers = new int[size];
        for(int i = 0; i < numbers.length; i++)
        numbers[i] = (int) (Math.random() * 9 + 1);
    }
    public void print(){
        for (int i = 0; i< numbers.length; i++){
            System.out.println(i + " = " + numbers[i]);
        }
    }
    public boolean search(int num){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == num){
                return true;
            }
        }   
        return false;
    }
}