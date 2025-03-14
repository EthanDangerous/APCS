public class ArrayTest{
    public void arrayDemo1(){
        System.out.println("Demo 1");
        int[] num = new int[5];
        num[0] = (int) (Math.random() * 15 + 1);
        num[1] = (int) (Math.random() * 15 + 1);
        num[2] = (int) (Math.random() * 15 + 1);
        num[3] = (int) (Math.random() * 15 + 1);
        num[4] = (int) (Math.random() * 15 + 1);
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
    }
    public void arrayDemo2(){
        System.out.println("Demo 2");
        int[] num = new int[25];
        for(int i = 0; i<num.length; i++){
            num[i] = (int) (Math.random()*9+1);
        }
        for(int i = 0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
    public void arrayDemo3(){
        System.out.println("Demo 3");
        String[] str = new String[5];
        str[0] = "zero";
        str[1] = "one";
        str[2] = "two";
        str[3] = "three";
        str[4] = "four";
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }
}