import java.util.ArrayList;

public class Runner {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<String>();
        words.add("It");
        words.add("is");
        words.add(0, "a");
        words.add(1, "lie");
        for(String each : words){
            System.out.println(each);
        }
    }
}
