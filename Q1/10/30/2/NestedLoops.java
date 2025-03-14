public class NestedLoops{
    public void drawFilledBox(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void drawFilledBox(int num1, int num2){
        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num2; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}