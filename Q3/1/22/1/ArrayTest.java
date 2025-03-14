public class ArrayTest {
    private String[] words;

    public ArrayTest(){
        String[] words = {"dog", "cat", "bird", "cow", "pig"};
    }

    public void printWords(){
        for(String each : words){
            System.out.println(each);
        }
        System.out.println();
    }

    public void swapWords(int ind1, int ind2){
        String storedWord = words[ind1];
        words[ind1] = words[ind2];
        words[ind2] = storedWord;
    }
}
