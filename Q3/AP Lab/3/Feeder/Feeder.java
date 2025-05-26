public class Feeder {
	
	/**
	 * The amount of food, in grams, currently in the bird feeder; initialized in the constructor and
	 * always greater than or equal to zero
	 */
    private int currentFood;  // how much food is currently available

    // For testing purposes
    public Feeder(int currentFood) {
        this.currentFood = currentFood;
    }

    // for testing
    public int getCurrentFood() {
        return currentFood;
    }

    // for testing
    public void updateCurrentFood(int currentFood) {
        this.currentFood = currentFood;
    }
    
    /**
	 * Simulates one day with numBirds birds or possibly a bear at the bird feeder,
	 * as described in part (a)
	 * Precondition: numBirds > 0
	 */
    public void simulateOneDay(int numBirds) {
        /* to be implemented in part (a) */
        int cond = (int) Math.random() * 100 + 1;

        if (cond <= 5){
            currentFood = 0;
        }else{
            int amtPer = (int) Math.random() * 40 + 11;
            currentFood -= (amtPer * numBirds);
            if (currentFood < 0){
                currentFood = 0;
            }
        }

    }


    /**
	 * Returns the number of days birds or a bear found food to eat at the feeder in this simulation,
	 * as described in part (b)
	 * Preconditions: numBirds > 0, numDays > 0
	 */
    public int simulateManyDays(int numBirds, int numDays) {
        /* to be implemented in part (b) */
        int dayReturn = 0;
        for(int i = 0; i<numDays; i++){
            if(currentFood == 0){
                break;
            }
            simulateOneDay(numBirds);
            dayReturn ++;
        }
        return dayReturn;
    }
}