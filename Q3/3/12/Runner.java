public class Runner {
    public static void main(String[] args){
        int[][] array = new int[2][3];
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                array[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        Array2D a2d = new Array2D();
        a2d.print(array);
        a2d.scramble(array);
        a2d.print(array);
    }
}
