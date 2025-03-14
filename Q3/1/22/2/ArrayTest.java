public class ArrayTest {

    public void printArray(int[] array){
        for(int each : array){
            System.out.println(each);
        }
        System.out.println();
    }

    public int search(int num, int[] array){
        for(int i = 0; i<array.length-1; i++){
            if(array[i] == num){
                return i;
            }
        }
        return -1;
    }

    public void scramble(int[] array){
        for(int i = 0; i<array.length - 1; i++){
            int swapWith = (int) (Math.random() * array.length - 1);
            int save = array[i];
            array[i] = array[swapWith];
            array[swapWith] = save;
        }
    }

    public void sort(int[] array){
        for(int i = 0; i<array.length -1; i++){
            if(array[i] > array[i+1]){
                int save = array[i];
                array[i] = array[i+1];
                array[i+1] = save;
            }
        }
    }
}
