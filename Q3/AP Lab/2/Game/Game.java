import java.util.ArrayList;

public class Game
{
	private Level levelOne;
	private Level levelTwo;
	private Level levelThree;
	private boolean bonus;
	private ArrayList<Integer> scores;
	private boolean nextScore = false;
	
	
	/** Postcondition: All instance variables have been initialized. */
	public Game (Level levelOne, Level levelTwo, Level levelThree, boolean bonus)
	{ 
		this.levelOne = levelOne;
		this.levelTwo = levelTwo;
		this.levelThree = levelThree;
		this.bonus = bonus;
		this.scores = new ArrayList<Integer>();
		this.scores.add(75);
		this.scores.add(50);
		this.scores.add(90);
		this.scores.add(20);
		
		this.scores.add(2400);
		this.scores.add(300);
		this.scores.add(0);
	}
	
	/** Returns true if this game is a bonus game and returns false otherwise */ 
	public boolean isBonus ()
	{
		return bonus;
	}
	
	/** Simulates the play of this Game (consisting of three levels) and updates all relevant 
	 * game data
	 */
	public void play()
	{ /* implementation not shown */ 
		nextScore = true;
	}
	
	/** Returns the score earned in the most recently played game, as described in part (a) */ 
	public int getScore()
	{/* to be implemented in part (a) */
		int score = 0;
		if(levelOne.goalReached()){
			score += levelOne.getPoints();
		}
		if(levelOne.goalReached() && levelTwo.goalReached()){
			score += levelTwo.getPoints();
		}
		if(levelOne.goalReached() && levelTwo.goalReached() && levelThree.goalReached()){
			score += levelThree.getPoints();
		}
		if(this.isBonus()){
			score = score * 3;
		}
		return score;
	}
	
	public int getScoreTest(){
		if( nextScore ){
			nextScore = false;
			return scores.remove(0);
		}else{
			return scores.get(0);
		}
	}
	
	/** Simulates the play of num games and returns the highest score earned, as
	 *  described in part (b)
	 *  Precondition: num > 0
	*/
	public int playManyTimes(int num)
	{ /* to be implemented in part (b) */
		int highScore = 0;
		if(getScoreTest()>highScore){
			highScore = getScoreTest();
		}
		for(int i = 0; i<num; i++){
			play();
			if(getScoreTest()>highScore){
				highScore = getScoreTest();
			}
		}
		return highScore;
		
		
		//Note!!
		//use getScoreTest() instead of getScore() 
		//in order to test your code.
	
	}
	

	
	// There may be instance variables, constructors, and methods that are not shown.
}