public class StringTest {
    private String email;

    public StringTest(String email){
        this.email = email;
    }

    public String toString(){
        int numChar = email.length();
        return email + " " + numChar;
    }

    public int countChar(char search){
        int numSearch = 0;
        for(int i = 0; i<email.length(); i++){
            if(email.charAt(i) == search){
                numSearch++;
            }
        }
        return numSearch;
    }

    public String getDomain(){
        int atPos = email.indexOf("@");
        int dotPos = email.lastIndexOf(".");
        String domain = email.substring(atPos + 1, dotPos);
        return domain;
    }
}
