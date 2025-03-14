public class ArrayTest {
    public void printArray(String[] array){
        for(int i = 0; i<array.length - 1; i++){
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public void scramble(String[] array){
        for(int i = 0; i<array.length - 1; i++){
            String store = array[i];
            int pos2 = (int)(Math.random() * (array.length - 1));
            array[i] = array[pos2];
            array[pos2] = store;
        }
    }

    public void sort(String[] array){
        for(int i = 0; i<array.length - 1; i++){
            if( array[i].compareTo( array[i+1] ) > 0 ){
                String store = array[i];
                array[i] = array[i+1];
                array[i+1] = store;
            }
        }
    }
}
