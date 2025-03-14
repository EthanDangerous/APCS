public class Table{
    private int row;
    private int col;
    public Table(int in1, int in2){
        row = in1;
        col = in2;
    }
    public void printDrawBox(){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("*");
            } 
            System.out.println("");
        }
    }
}