public class Test{
    public void print(int[] input){
        for(int each : input){
            System.out.println(each);
        }
    }
    public boolean contains(int[] arrIn, int intIn){
        for(int i = 0; i<arrIn.length; i++){
            if(arrIn[i] == intIn){
                return true;
            }
        }
        return false;
    }
    public int getProduct(int[] input){
        int total = 1;
        for(int i = 0; i<input.length; i++){
            total = total * input[i];
        }
        return total;
    }
    public int getLargest(int[] input){
        int largest = input[0];
        for(int i = 0; i<input.length; i++){
            if(largest < input[i]){
                largest = input[i];
            }
        }
        return largest;
    }
}