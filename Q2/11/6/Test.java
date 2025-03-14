public class Test{
    public void randomCount(){
        int rnd = (int) (Math.random() * 11 + 10);
        for(int i = 1; i <= rnd; i++){
            System.out.println(i);
        }
    }
    public void randomSquare(){
        int rnd = (int) (Math.random() * 6 + 5);
        for(int i = 0; i <= rnd; i++){
            for(int j = 0; j <= rnd; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}