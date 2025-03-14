public class Runner {
    public static void main(String[] args){
        StringTest st = new StringTest("The quick brown fox jumps over the lazy dog");
        st.printInfo();
        st.printChar(0);
        st.printChar(5);
        st.printChar(10);
        st.printChar(15);
        st.printLocation("h");
        st.printLocation("e");
        st.printLocation("jumps");
        st.printLocation("dog");
        int charNum = st.countChar("o");
        System.out.println(charNum);
        boolean hasDog = st.contains("dog");
        System.out.println("has dog: " + hasDog);
        boolean hasJava = st.contains("java");
        System.out.println("has java: " + hasJava);
        int numVowels = st.countVowels();
        System.out.println("number of vowels: " + numVowels);
    }
}
