public class BoxOfCandy {

	private Candy[][] box;
	
	// Constructor
	public BoxOfCandy(int rows, int cols) {
		// instantiate the box
		box = new Candy[rows][cols];
	}
		
		
	// For testing purposes. 	
	public void addCandy(int row, int col, String flavor) {	
		// Put the candy in the box
		box[row][col] = new Candy(flavor);
	}
		
	// For testing purposes.
	public void printBox() {
		// Print the column heading
		for (int col=0; col<box[0].length; col++) {
			System.out.print("\t" + col);
		}
		System.out.println();
		for (int row=0; row< box.length; row++) {
			System.out.print(row + "\t");
			for (int col=0; col<box[row].length; col++) {
				if (box[row][col] != null)
					System.out.print(box[row][col].getFlavor() + "\t");
				else
					System.out.print("  \t");
			}
		System.out.println();
		}
		
	}
	
	
	/* Moves one piece of candy in column col, if necessary and possible, so that the box
	   element in row 0 of column col contains a piece of candy, as described in part (a).
	   Returns false if there is no piece of candy in column col and returns true otherwise.
	   Precondition: col is a valid column index in box.
	*/
	 public boolean moveCandyToFirstRow(int col) {
		 if (box[0][col] != null) {
			 return true;
		 }
		 for (int row = 1; row < box.length; row++) {
			 if (box[row][col] != null) {
				 // Move candy to row 0
				 box[0][col] = box[row][col];
				 box[row][col] = null;
				 return true;
			 }
		 }
		 return false;
	}
	
	/** Removes from box and returns a piece fo candy with flavor specified by the parameter, or
	    returns null if no such piece is found as described in part (b).
	**/
	public Candy removeNextByFlavor(String flavor) {

// Search each position in the box
		for (int row = 0; row < box.length; row++) {
			for (int col = 0; col < box[row].length; col++) {
				if (box[row][col] != null && box[row][col].getFlavor().equals(flavor)) {
					Candy foundCandy = box[row][col];
					box[row][col] = null;
					return foundCandy;
				}
			}
		}
		return null;
	}
	
}
		