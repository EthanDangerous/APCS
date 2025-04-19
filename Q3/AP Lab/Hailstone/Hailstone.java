public class Hailstone
{
	/** Returns the length of a hailstone sequence that starts with n,
	* as described in part (a).
	* Precondition: n>0
	*/
	public static int hailstoneLength(int n)
	{ /* to be implemented in part (a) */
		int num = 1;
		int currentNum = n;
		while(nextHailstone(currentNum) >=1){
			currentNum = nextHailstone(currentNum);
			num++;
		}
		return num;
	}

	public static int nextHailstone(int n){
		if(n==1){
			return -1;
		}
		if(n%2 == 0){
			return n/2;
		}else if(n%2 == 1){
			return (3*n)+1;
		}
		return -1;
	}
	
	/** Returns true if the hailstone sequence that starts with n is considered long
	* and false otherwise, as described in part (b).
	* Precondition: n>0
	*/
	public static boolean isLongSeq(int n)
	{ /* to be implemented in part (b) */
		
		return true;
	}
	
	
	/** Returns the proportion of the first n hailstone sequences that are considered long,
	* as described in part (c).
	* Precondition: n>0
	*/
	public static double propLong(int n)
	{ /* to be implemented in part (c) */ 
		return 0.1;
		
	}
	// There may be instance variables, constructors, and methods not shown.
}
