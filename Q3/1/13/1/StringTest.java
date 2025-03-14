public class StringTest {
    private String word;

    public StringTest(String string){
        this.word = string;
    }

    private char getFirstLetter(){
        char firstChar = word.charAt(0);
        return firstChar;
    }

    private char getLastLetter(){
        char lastChar = word.charAt(word.length() - 1);
        return lastChar;
    }

    public void printWordGame(){
        System.out.print(getFirstLetter() + " ");
        int numStar = word.length() - 2;
        while(numStar > 0){
            System.out.print("* ");
            numStar--;
        }
        System.out.print(getLastLetter());
    }
}
