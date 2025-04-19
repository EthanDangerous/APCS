public class Game {
    private int[][] table;
    public int turn;

    public Game(){
        table = new int[3][3];
        for(int i = 0; i<table.length; i++){
            for(int j = 0; j<table[i].length; j++){
                table[i][j] = 0;
            }
        }
        turn = 1;
    }

    public void printTable(){
        for(int i = 0; i<table.length; i++){
            for(int j = 0; j<table[i].length; j++){
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void insertXO(int row, int column){
        if(table[row][column] == 0){
            table[row][column] = turn;
        }
    }

    public boolean checkFull(){
        for(int i = 0; i<table.length; i++){
            for(int j = 0; j<table[i].length; j++){
                if(table[i][j] == 0){
                    return false;
                }
            }
        }
        return false;
    }

    public int checkTicTacToe(){
        if(table[0][0] == 1 && table[0][1] == 1 && table[0][2] == 1){
            return 1;
        }else if(table[1][0] == 1 && table[1][1] == 1 && table[1][2] == 1){
            return 1;
        }else if(table[2][0] == 1 && table[2][1] == 1 && table[2][2] == 1){
            return 1;
        }else if(table[0][0] == 1 && table[1][0] == 1 && table[2][0] == 1){
            return 1;
        }else if(table[0][1] == 1 && table[1][1] == 1 && table[2][1] == 1){
            return 1;
        }else if(table[0][2] == 1 && table[1][2] == 1 && table[2][2] == 1){
            return 1;
        }else if(table[0][0] == 1 && table[1][1] == 1 && table[2][2] == 1){
            return 1;
        }else if(table[0][2] == 1 && table[1][1] == 1 && table[2][0] == 1){
            return 1;
        }

        if(table[0][0] == 2 && table[0][1] == 2 && table[0][2] == 2){
            return 2;
        }else if(table[1][0] == 2 && table[1][1] == 2 && table[1][2] == 2){
            return 2;
        }else if(table[2][0] == 2 && table[2][1] == 2 && table[2][2] == 2){
            return 2;
        }else if(table[0][0] == 2 && table[1][0] == 2 && table[2][0] == 2){
            return 2;
        }else if(table[0][1] == 2 && table[1][1] == 2 && table[2][1] == 2){
            return 2;
        }else if(table[0][2] == 2 && table[1][2] == 2 && table[2][2] == 2){
            return 2;
        }else if(table[0][0] == 2 && table[1][1] == 2 && table[2][2] == 2){
            return 2;
        }else if(table[0][2] == 2 && table[1][1] == 2 && table[2][0] == 2){
            return 2;
        }
        return 0;
    }
}
