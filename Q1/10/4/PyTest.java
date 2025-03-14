public class PyTest{
    private int a;
    private int b;
    public PyTest(){
        a = 0;
        b = 0;
    }
    public PyTest(int aIn, int bIn){
        a = aIn;
        b = bIn;
    }
    public void printC(){
        double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        System.out.println("C: "+c);
    }
    public void printC(int aIn, int bIn){
        a = aIn;
        b = bIn;
        printC();
    }
}