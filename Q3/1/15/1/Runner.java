public class Runner {
    public static void main(String[] args){
        StringTest st = new StringTest("tom@mvla.net");
        System.out.println(st);
        int countChar = st.countChar('m');
        System.out.println(countChar);
        String domain = st.getDomain();
        System.out.println(domain);
    }
}
