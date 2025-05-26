public class Data
{
	public static final int MAX = 999;/* value not shown */;
	private int[][] grid;
	
	public Data(int[][] grid){
		this.grid = grid;
	}
	
	/** Fills all elements of grid with randomly generated values, as described in part (a)
	* Precondition: grid is not null.
	* grid has at least one element.
	*/
	public void repopulate()
	{ /* to be implemented in part (a) */
		for(int i = 0; i<grid.length; i++){
			for(int j = 0; j<grid[i].length; j++){
				int num = 1;
				while( (num % 10 != 0) || (num % 100 == 0) ){
					num = (int) (Math.random() * MAX + 1);
				}
				grid[i][j] = num;
			}
		}
		
	}


	/** Returns the number of columns in grid that are in increasing order, as described
	* in part (b)
	* Precondition: grid is not null.
	* grid has at least one element.
	*/
	public int countIncreasingCols()
	{ /* to be implemented in part (b) */ 
		int returnNum = 0;
		int colNum = grid[0].length;
		for (int col = 0; col < colNum; col++) {
			boolean isIncreasing = true;
			for (int row = 1; row < grid.length; row++) {
				if (grid[row][col] < grid[row-1][col]) {
					isIncreasing = false;
					break;
				}
			}
			if (isIncreasing) {
				returnNum++;
			}
		}
		return returnNum;
	}
	
	public String toString(){
		String txt = "";
		for(int r=0; r<grid.length; r++){
			for(int c=0; c<grid[r].length; c++){
				txt += grid[r][c] + "\t";
			}
			txt += "\n";
		}
		return txt;
	}
	// There may be instance variables, constructors, and methods that are not shown.
}