import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        while(true){
            game.turn = 1;
            game.printTable();
            System.out.println("Player 1 please choose the row you would like to place in:");
            int row = Integer.valueOf(sc.nextLine());
            System.out.println("Player 1 please choose the column you would like to place in:");
            int column = Integer.valueOf(sc.nextLine());
            game.insertXO(row, column);
            game.printTable();
            if(game.checkTicTacToe() != 0){
                System.out.println("Winner is player " + game.checkTicTacToe() + "!");
                break;
            }
            if(game.checkFull()){
                System.out.println("Game over!");
                break;
            }
            game.turn = 2;
            System.out.println("Player 2 please choose the row you would like to place in:");
            row = Integer.valueOf(sc.nextLine());
            System.out.println("Player 2 please choose the column you would like to place in:");
            column = Integer.valueOf(sc.nextLine());
            game.insertXO(row, column);
            game.printTable();
            if(game.checkTicTacToe() != 0){
                System.out.println("Winner is player " + game.checkTicTacToe() + "!");
                break;
            }
            if(game.checkFull()){
                System.out.println("Game over!");
                break;
            }
        }
    }
}
