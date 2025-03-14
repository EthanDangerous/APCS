public class Runner {
    public static void main(String[] args){
        String[] words = {"word1", "word2", "word3", "word4", "word5"};
        ArrayTest at = new ArrayTest();

        at.printArray(words);
        at.scramble(words);
        at.printArray(words);
        at.sort(words);
        at.printArray(words);
    }
}
