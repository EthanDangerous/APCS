public class Runner
{
	public static void main(String[] args)
	{
		boolean[][] blackSquares = new boolean[7][9];
		blackSquares[0][0] = true;
		blackSquares[0][1] = false;
		blackSquares[0][2] = false;
		blackSquares[0][3] = true;
		blackSquares[0][4] = true;
		blackSquares[0][5] = true;
		blackSquares[0][6] = false;
		blackSquares[0][7] = false;
		blackSquares[0][8] = false;
		
		blackSquares[1][0] = false;
		blackSquares[1][1] = false;
		blackSquares[1][2] = false;
		blackSquares[1][3] = false;
		blackSquares[1][4] = true;
		blackSquares[1][5] = false;
		blackSquares[1][6] = false;
		blackSquares[1][7] = false;
		blackSquares[1][8] = false;
		
		blackSquares[2][0] = false;
		blackSquares[2][1] = false;
		blackSquares[2][2] = false;
		blackSquares[2][3] = false;
		blackSquares[2][4] = false;
		blackSquares[2][5] = false;
		blackSquares[2][6] = true;
		blackSquares[2][7] = true;
		blackSquares[2][8] = true;
		
		blackSquares[3][0] = false;
		blackSquares[3][1] = false;
		blackSquares[3][2] = true;
		blackSquares[3][3] = false;
		blackSquares[3][4] = false;
		blackSquares[3][5] = false;
		blackSquares[3][6] = true;
		blackSquares[3][7] = false;
		blackSquares[3][8] = false;
		
		blackSquares[4][0] = true;
		blackSquares[4][1] = true;
		blackSquares[4][2] = true;
		blackSquares[4][3] = false;
		blackSquares[4][4] = false;
		blackSquares[4][5] = false;
		blackSquares[4][6] = false;
		blackSquares[4][7] = false;
		blackSquares[4][8] = false;
		
		blackSquares[5][0] = false;
		blackSquares[5][1] = false;
		blackSquares[5][2] = false;
		blackSquares[5][3] = false;
		blackSquares[5][4] = true;
		blackSquares[5][5] = false;
		blackSquares[5][6] = false;
		blackSquares[5][7] = false;
		blackSquares[5][8] = false;
		
		blackSquares[6][0] = false;
		blackSquares[6][1] = false;
		blackSquares[6][2] = false;
		blackSquares[6][3] = true;
		blackSquares[6][4] = true;
		blackSquares[6][5] = true;
		blackSquares[6][6] = false;
		blackSquares[6][7] = false;
		blackSquares[6][8] = true;
		
		Crossword cw = new Crossword(blackSquares);
		System.out.println(cw.getPuzzle());
	}
}