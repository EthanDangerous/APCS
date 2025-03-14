public class Test{
    public void print(int[] input){
        for(int each : input){
            System.out.println(each);
        }
    }
    public int find(int[] arrIn, int intIn){
        for(int i = 0; i<arrIn.length; i++){
            if(arrIn[i] == intIn){
                return i;
            }
        }
        return -1;
    }
    public int getSummation(int[] sumIn){
        int total = 0;
        for(int i = 0; i<sumIn.length; i++){
            total = total + sumIn[i];
        }
        return total;
    }
    public int getSmallest(int[] smallIn){
        int smallest = smallIn[0];
        for(int i = 0; i<smallIn.length; i++){
            if(smallest>smallIn[i]){
                smallest = smallIn[i];
            }
        }
        return smallest;
    }
}