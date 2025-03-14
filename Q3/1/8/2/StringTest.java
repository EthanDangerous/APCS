public class StringTest {
    private String myText;

    public StringTest(String text){
        this.myText = text;
    }

    private int getLength(){
        int length = myText.length();
        return length;
    }

    public void printInfo(){
        System.out.println(myText);
        System.out.println(myText.getLength());
    }

    public void printChar(int character){
        System.out.println(myText.charAt(character));
    }

    public void printLocation(String string){
        System.out.println(myText.indexOf(string));
    }

    public int countChar(char character){
        int numChar = 0;
        for(int each : myText){
            if(myText.charAt(each) = character){
                numChar++;
            }
        }
    }

    public boolean contains(String string){
        if(myText.indexOf(string) != -1){
            return true;
        }
        return false;
    }

    public int countVowels(){
        int numVowels = 0;
        for(int each : myText){
            if(myText.charAt(each); == "a" || "e" || "i" || "u" || "A" || "E" || "I" || "U"){
                numVowels++;
            }
        }
        return numVowels;
    }
}
