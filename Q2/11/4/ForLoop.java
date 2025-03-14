public class ForLoop{
    public void count(int in1, int in2){
        if(in1 < in2){
            for(int i = in1; i<=in2; i++){
                System.out.println(i);
            }
            System.out.println("");
        } else{
            for(int i = in1; i>=in2; i--){
                System.out.println(i);
            }
            System.out.println("");
        }
        
    }
    public int sum(int in){
        int total = 0;
        for(int j = 0; j<=in; j++){
            total += j;
        }
        return total;
    }
}