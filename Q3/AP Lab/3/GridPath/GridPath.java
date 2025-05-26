public class GridPath {

    // 2D Array of integers
    private int[][] grid;

    // For testing purposes
    public GridPath(int[][] grid) {
        this.grid = grid;
    }

    /**
     * Returns the Location representing a neighbor of the grid element at row and col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in grid.
     * row and col do not specify the element in the last row and last column of grid.
     */
    public Location getNextLoc(int row, int col)
    { /* to be implemented in part (a) */
        if(row<grid.length-1 && col<grid.length-1 && row<grid[row].length-1 && col<grid[row].length-1){
            if(grid[row+1][col] > grid[row][col+1]){
                return new Location(row, col+1);
            }else{
                return new Location(row+1, col);
            }
        }else{
            if(row<grid.length-1){
                return new Location(row+1, col);
            }else{
                return new Location(row, col+1);
            }
        }
    }


    /**
     * Computes and returns the sum of all values on a path through grid, as described in
     * part (b)
     * Preconditions: row is a valid row index and col is a valid column index in grid.
     * row and col do not specify the element in the last row and last column of grid.
     */
    public int sumPath(int row, int col)
    { /* to be implemented in part (b) */
        int sum = 0;
        while(true){
            if(row == grid.length-1 && col == grid.length-1){
                break;
            }
            sum += grid[row][col];
            Location nextLoc = getNextLoc(row, col);
            row = nextLoc.getRow();
            col = nextLoc.getCol();
        }
        return sum;
    }
    
}