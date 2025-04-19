public class Successors{
		
	public static Position findPosition(int num, int[][] intArr)
	{ /* to be implemented in part (a) */
		for(int i = 0; i<intArr.length; i++){
			for(int j = 0; j<intArr[i].length; j++){
				if(intArr[i][j] == num){
					return new Position(i, j);
				}
			}
		}
		return null;
	}
	
	public static Position[][] getSuccessorArray(int[][] intArr)
	{ /* to be implemented in part (b) */
		Position[][] array = new Position[intArr.length][intArr[0].length];
		for(int i = 0; i<intArr.length; i++){
			for(int j = 0; j<intArr[i].length; j++){
				Position pos = findPosition(intArr[i][j]+1, intArr);
				array[i][j] = pos;
			}
		}
		return array;
	}
}