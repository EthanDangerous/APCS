import java.util.*;

public class Array2DDemo {
    Scanner sc = new Scanner(System.in);

    private void print2DInt(int[][] array){
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
        }
    }

    public int[][] test1(){
        int[][] array1 = new int[5][5];
        for(int i = 0; i<array1.length; i++){
            for(int j = 0; j<array1[i].length; j++){
                array1[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        return array1;
    }

    public void test2(){
        int[][] store = test1();
        print2DInt(store);
        System.out.println(" ");
        int largest = -1;
        for(int i = 0; i<store.length; i++){
            for(int j = 0; j<store[i].length; j++){
                if(store[i][j] > largest){
                    largest = store[i][j];
                }
            }
        }
    }

    public void test3(){
        int[][] store = test1();
        print2DInt(store);
        System.out.println("\n" + "Please give an int to change to 99 (must be 1-10)");
        int userNum = Integer.valueOf(sc.nextLine());
        for(int i = 0; i<store.length; i++){
            for(int j = 0; j<store[i].length; j++){
                if(store[i][j] == userNum){
                    store[i][j] = 99;
                }
            }
        }
        print2DInt(store);
    }

    public void test4(){
        String[][] store = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};
        System.out.println("Please choose a letter, and if it is included then it will be located.");
        String choice = sc.nextLine();
        for(int i = 0; i<store.length; i++){
            for(int j = 0; j<store[i].length; j++){
                if(store[i][j].equals(choice)){
                    System.out.println("yes " + i + ", " + j);
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
