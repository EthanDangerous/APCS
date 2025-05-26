public class AppointmentBook {

	// 2D Array for keeping track of teacher schedule
	private boolean[][] freeMinutes;
	
	// constructor
	public AppointmentBook() {
		// instantiate freeMinutes
		freeMinutes = new boolean[8][60];
		
		// initialize the boolean array to true (default is false)
		for (int i=0; i<freeMinutes.length; i++) {
			for (int j=0; j<freeMinutes[i].length; j++) {
				freeMinutes[i][j] = true;
			}
		}
	}
		
	/** Returns true if minute in period is available for an appointment and returns
	    false otherwise.
		Preconditions: 1<=period<=8; 0<=minute<=59
	**/
	private boolean isMinuteFree(int period, int minute) {
		
		// subtract 1 from period as indices are 0-7, not 1-8
		return freeMinutes[period-1][minute];
	}
	
	
	/** Marks the block of minutes that starts at startMinute in period and 
	    is duration minutes long as reserved for an appointment.
		Preconditions: 1<=period<=8; 0<=startMinute<=59; 1<=duration<=60
	**/
	// This method is private in the question but is public here for testing purposes.
	public void reserveBlock(int period, int startMinute, int duration) {
	
		for (int i=startMinute; i<startMinute+duration; i++) {
			freeMinutes[period-1][i] = false;
		}
	}
	
	
	/* Searches for the first block of duration free minutes during period, as described in    
	   part (a). Returns the first minute in the block if such a block is found or returns -1 if no
	   such block is found.
	   Preconditions: 1<=period<=8; 1<=duration<=60
	*/
	public int findFreeBlock(int period, int duration) {
		// to be implemented in part (a)
		for(int i = 0; i<60; i++){
			if(isMinuteFree(period, i)){
				int consecMins = 0;
				for(int j = i; j<i+duration; j++){
					if(j>=60){
						break;
					}
					if(isMinuteFree(period, j)){
						consecMins++;
					}
				}
				if(consecMins >= duration){
					return i;
				}
			}
		}
		return -1;
	}
	
	
	/* Searches periods from startPeriod to endPeriod, inclusive, for a block 
	   of duration free minutes, as described in part (b). If such a block is found,
	   calls reserveBlock to reserve the block of minutes and returns true; otherwise
	   returns false.
	**/
	public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
		// to be implemented in part (b)
		for(int i = startPeriod; i<=endPeriod; i++){
			if(findFreeBlock(i, duration) != -1){
				reserveBlock(i, findFreeBlock(i, duration), duration);
				return true;
			}
		}
		return false;
	}
	
	public void printTable(){
		
		//go through periods
		for (int i=1; i<4; i++) {
			boolean prev = false;
			int duration = 0;
			for (int j=0; j<freeMinutes[i].length; j++) {
				boolean current = freeMinutes[i][j];
				//System.out.println("j" + current );
				if( j==0 ){
					duration = 1;		
				} else {
					
					if( current == prev ){
						duration++;
						if( j==freeMinutes[i].length-1 ){
							//print current data
							System.out.print( "Per:" + (i+1) );
							System.out.print( "\tMins:" + (j+1-duration) + "-" + (j) + "(" + duration + " mins)" );
							System.out.println( "\tAvail:" + (current ? "Yes" : "No") );
						}
					} else {
						if( j==freeMinutes[i].length-1 ){
							//print current data
							System.out.print( "Per:" + (i+1) );
							System.out.print( "\tMins:" + (j+1-duration) + "-" + (j) + "(" + duration + " mins)" );
							System.out.println( "\tAvail:" + (current ? "Yes" : "No") );
						} else {
							//print previous data
							System.out.print( "Per:" + (i+1) );
							System.out.print( "\tMins:" + (j-duration) + "-" + (j-1) + "(" + duration + " mins)" );
							System.out.println( "\tAvail:" + (prev ? "Yes" : "No") );
							
							//reset duration
							duration = 1;
						}
					}
					
				}
				
				
				prev = current;
			}
		}
	}
}
	   