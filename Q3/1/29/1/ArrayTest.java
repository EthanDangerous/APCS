public class ArrayTest {
    private int[] numArray;

    public ArrayTest(int num){
        numArray = new int[num];
        for(int i = 0; i<num; i++){
            numArray[i] = (int) (Math.random() * 5);
        }
    }

    public void printArray(){
        for(int each : numArray){
            System.out.println(each);
        }
        System.out.println();
    }

    public int search(int search){
        for(int i = 0; i<numArray.length; i++){
            if(numArray[i] == search){
                return i;
            }
        }
        return -1;
    }

    public void scramble(){
        for(int each : numArray){
            int swap = (int) (Math.random() * numArray.length);
            int save = numArray[each];
            numArray[each] = numArray[swap];
            numArray[swap] = save;
        }
    }

    public void sort(){
        for(int i = 0; i<numArray.length-1; i++){
            if(numArray[i] > numArray[i+1]){
                int swap = numArray[i];
                numArray[i] = numArray[i+1];
                numArray[i+1] = swap;
            }
        }
    }
}
