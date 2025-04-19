public class ArrayResizer 
{ 
	/** Returns true if and only if every value in row r of array2D is non-zero. 
	* Precondition: r is a valid row index in array2D. 
	* Postcondition: array2D is unchanged. 
	*/ 
	public static boolean isNonZeroRow(int[][] array2D, int r) 
	{ /* to be implemented in part (a) */ 
		for(int i = 0; i<array2D[r].length; i++){
			if(array2D[r][i] == 0){
				return false;
			}
		}
		return true;
	}

	
	/** Returns the number of rows in array2D that contain all non-zero values. 
	* Postcondition: array2D is unchanged. 
	*/ 
	public static int numNonZeroRows(int[][] array2D) 
	{ /* implementation not shown */ 
		int count = 0;
		for(int r=0; r<array2D.length; r++){
			if( isNonZeroRow(array2D, r) )
				count++;
		}
		return count;
	} 
	
	
	/** Returns a new, possibly smaller, two-dimensional array that contains only rows 
	* from array2D with no zeros, as described in part (b). 
	* Precondition: array2D contains at least one column and at least one row with no zeros. 
	* Postcondition: array2D is unchanged. 
	*/ 
	public static int[][] resize(int[][] array2D) 
	{ /* to be implemented in part (b) */ 
		int rows = numNonZeroRows(array2D);
		int[][] newArray = new int[rows][4];
		for(int i = 0; i<array2D.length; i++){
			if(isNonZeroRow(array2D, i)){
				for(int j = 0; j< newArray.length; j++){
					if(!isNonZeroRow(newArray, j)){
						newArray[j] = array2D[i];
						break;
					}
				}
			}
		}
		return newArray;
	} 
} 