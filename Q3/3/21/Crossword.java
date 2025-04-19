public class Crossword
{
 /** Each element is a Square object with a color (black or white) and a number.
 * puzzle[r][c] represents the square in row r, column c.
 * There is at least one row in the puzzle.
 */
 private Square[][] puzzle;
 
 
 /** Constructs a crossword puzzle grid.
 * Precondition: There is at least one row in blackSquares.
 * Postcondition:
 * - The crossword puzzle grid has the same dimensions as blackSquares.
 * - The Square object at row r, column c in the crossword puzzle grid is black
 * if and only if blackSquares[r][c] is true.
 * - The squares in the puzzle are labeled according to the crossword labeling rule.
 */
 public Crossword(boolean[][] blackSquares)
 { /* to be implemented in part (b) */
	 for(int i = 0; i< blackSquares.length; i++){
		 for(int j = 0; j< blackSquares[i].length; j++){
			if(toBeLabeled(i, j, blackSquares)){

			}
		 }
	 }
 }
 
 
 /** Returns true if the square at row r, column c should be labeled with a positive number;
 * false otherwise.
 * The square at row r, column c is black if and only if blackSquares[r][c] is true.
 * Precondition: r and c are valid indexes in blackSquares.
 */
 private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
 { /* to be implemented in part (a) */ 
	if(!blackSquares[r][c]){
		if(r == 0 || blackSquares[r-1][c] || c == 0 || blackSquares[r][c-1]){
			return true;
		}
	}
	return false;
 }
 

 public String getPuzzle()
 {
	 String str = "";
	 for(int r=0; r<puzzle.length; r++)
	 {
		 for(int c=0; c<puzzle[r].length; c++)
		 {
			 if( puzzle[r][c].isBlack() )
			 {
				 str += "XX";
			 }
			 else
			 {
				 if(puzzle[r][c].getNum() > 0 )
				 {
					if(puzzle[r][c].getNum() < 10)
					{
						str += "0";
					}
					str += puzzle[r][c].getNum();
				 }
				 else
				 {
					str += "__";
				 }
			 }
		 }
		 str += "\n";
	 }
	 return str;
 }
} 