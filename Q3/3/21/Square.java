public class Square
{
 /** Constructs one square of a crossword puzzle grid.
 * Postcondition:
 * - The square is black if and only if isBlack is true.
 * - The square has number num.
 */
 private boolean isBlack;
 private int num;
 public Square(boolean isBlack, int num)
 { /* implementation not shown */ 
	this.isBlack = isBlack;
	this.num = num;
 }
 
 public boolean isBlack()
 {
	 return isBlack;
 }
 
 public int getNum()
 {
	 return num;
 }
 // There may be instance variables, constructors, and methods that are not shown.
} 