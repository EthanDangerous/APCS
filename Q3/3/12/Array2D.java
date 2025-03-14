public class Array2D {
    public void print(int[][] array){
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void scramble(int[][] array){
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                int save = array[i][j];
                int randI = (int) (Math.random() * array.length);
                int randJ = (int) (Math.random() * array[i].length);
                array[i][j] = array[randI][randJ];
                array[randI][randJ] = save;
            }
        }
    }
}
