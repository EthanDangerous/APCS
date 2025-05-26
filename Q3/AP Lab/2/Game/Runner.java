public class Runner {
	public static void main(String[] args){
		Level l1 = new Level(true,200);
		Level l2 = new Level(true,100);
		Level l3 = new Level(true,500);
		
		
		System.out.println("Testing Part A: ");
		Game game = new Game(l1,l2,l3,true);
		System.out.println("Level One - " + l1.toString());
		System.out.println("Level Two - " + l2.toString());
		System.out.println("Level Three - " + l3.toString());
		System.out.println("Bonus: " + game.isBonus());
		System.out.println("Score: " + game.getScore() + "\n");
		
		l1 = new Level(true,200);
		l2 = new Level(true,100);
		l3 = new Level(false,500);
		game = new Game(l1,l2,l3,false);
		System.out.println("Level One - " + l1.toString());
		System.out.println("Level Two - " + l2.toString());
		System.out.println("Level Three - " + l3.toString());
		System.out.println("Bonus: " + game.isBonus());
		System.out.println("Score: " + game.getScore() + "\n");
		
		l1 = new Level(true,200);
		l2 = new Level(false,100);
		l3 = new Level(true,500);
		game = new Game(l1,l2,l3,true);
		System.out.println("Level One - " + l1.toString());
		System.out.println("Level Two - " + l2.toString());
		System.out.println("Level Three - " + l3.toString());
		System.out.println("Bonus: " + game.isBonus());
		System.out.println("Score: " + game.getScore() + "\n");
		
		l1 = new Level(false,200);
		l2 = new Level(true,100);
		l3 = new Level(true,500);
		game = new Game(l1,l2,l3,false);
		System.out.println("Level One - " + l1.toString());
		System.out.println("Level Two - " + l2.toString());
		System.out.println("Level Three - " + l3.toString());
		System.out.println("Bonus: " + game.isBonus());
		System.out.println("Score: " + game.getScore() + "\n");
		
		System.out.println("Testing Part B: ");
		System.out.println("playManyTimes(4) with scores of 75, 50, 90, and 20");
		System.out.println("Results: " + game.playManyTimes(4));
		System.out.println("playManyTimes(3) with scores of 2400, 300, and 0");
		System.out.println("Results: " + game.playManyTimes(3));
	}
}