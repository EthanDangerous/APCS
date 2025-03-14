public class PyRunner{
    public static void main(String[] agrs){
        PyTest p1 = new PyTest();
        p1.printC();
        PyTest p2 = new PyTest(3, 4);
        p2.printC();
        p2.printC(6, 8);
    }
}