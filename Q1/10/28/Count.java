public class Count{
    public int getTotal(int input){
        int total = 0;
        int loop = 0;
        while(loop <= input){
            total = total + loop;
            loop += 2;
        }
        return total;
    }
}