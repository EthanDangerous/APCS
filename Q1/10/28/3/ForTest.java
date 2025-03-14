public class ForTest{
    public void printCount(){
        int count = 0;
        while(count <= 100){
            count ++;
            System.out.println(count);
        }
    }
    public void printCount(int in){
        for(int i=0; i>=in; i++){
            System.out.println(i);
        }
    }
    public void printCount(int in, int in2){
        for(in<=in2; in>=in2; in++){
            System.out.println(in);
        }
    }
    /*
    public void getFactorial(int in){
        int count = in;
        for(in<=in2; in>=in2; in--){
            in 
            System.out.println(in);
        }
    }
    */
}