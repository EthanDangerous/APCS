public class ArrayTest {
    private int[] numArray;
    private String[] stringArray;

    public ArrayTest(){
        numArray = new int[10];
        for(int i = 0; i<10; i++){
            numArray[i] = (int) (Math.random() * 20 + 1);
        }
        stringArray = new String[5];
        stringArray[0] = "cat";
        stringArray[1] = "dog";
        stringArray[2] = "pig";
        stringArray[3] = "cow";
        stringArray[4] = "sheep";
    }

    public void printNumArray(){
        for(int i = 0; i<10; i++){
            System.out.println(numArray[i]);
        }
        System.out.println();
    }

    public void printStringArray(){
        for(int i = 0; i<5; i++){
            System.out.println(stringArray[i]);
        }
        System.out.println();
    }

    public void swapNumArray(int pos1, int pos2){
        int num1 = numArray[pos1];
        int num2 = numArray[pos2];
        numArray[pos1] = num2;
        numArray[pos2] = num1;
    }

    public void swapStringArray(int pos1, int pos2){
        String string1 = stringArray[pos1];
        String string2 = stringArray[pos2];
        stringArray[pos1] = string2;
        stringArray[pos2] = string1;
    }

    public int searchString(String search){
        for(int i = 0; i<5; i++){
            if(stringArray[i].equals(search)){
                return i;
            }
        }
        return -1;
    }

    public int countLetter(char letter){
        int totalChar = 0;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<stringArray[i].length(); j++){
                if(stringArray[i].charAt(j) == letter){
                    totalChar++;
                }
            }
        }
        return totalChar;
    }
}
