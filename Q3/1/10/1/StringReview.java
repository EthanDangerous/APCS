public class StringReview {
    public char getChar(String string, int number){
        char result = string.charAt(number);
        return result;
    }

    public int countChar(String string, char character){
        int totalChar = 0;
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i) == character){
                totalChar++;
            }
        }
        return totalChar;
    }
}
