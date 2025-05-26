public class Runner {
	public static void main(String[] args){
		System.out.println("Testing Part A: ");
		System.out.println("The following should be random numbers that are divisible by 10 but not by 100.");
		
		Data test = new Data(new int[3][4]);
		test.repopulate();
		System.out.println(test);
		
		test = new Data(new int[2][7]);
		test.repopulate();
		System.out.println(test);
		
		System.out.println("Testing Part B: ");
		int[][] grid = { {10,50,40}, {20,40,20}, {30,50,30} };
		test = new Data(grid);
		System.out.println(test);
		System.out.println("countIncreasingCols(): " + test.countIncreasingCols());
		
		int[][] grid2 = { {10,540,440,440}, {220,450,440,190} };
		test = new Data(grid2);
		System.out.println("\n\n"+test);
		System.out.println("countIncreasingCols(): " + test.countIncreasingCols());
	}
}