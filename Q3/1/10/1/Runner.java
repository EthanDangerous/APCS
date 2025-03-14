public class Runner {
    public static void main(String[] args){
        StringReview sr = new StringReview();

        char get1 = sr.getChar("Hello World!", 2);
        char get2 = sr.getChar("Hello World!", 1);
        int count1 = sr.countChar("Hello World!", 'o');
        int count2 = sr.countChar("Hello World!", 'l');

        System.out.println(get1);
        System.out.println(get2);
        System.out.println(count1);
        System.out.println(count2);
    }
}
