import java.util.ArrayList;

public class WeatherData {
	
	/* Guaranteed not to be null and to contain only non-null entries */
	private ArrayList<Double> temperatures;
	
	/* constructor for testing purposes */
	public WeatherData() {
		
		// instantiate temperatures
		temperatures = new ArrayList<Double>();
	}
	
	/* adds temperatures to the ArrayList, for testing purposes */
	public void addTemp(double temp) {
		temperatures.add(temp);
	}
	
	/* print the data for testing purposes */
	public void printData() {
		for (int i=0; i<temperatures.size(); i++) {
			System.out.print("  " + temperatures.get(i));
		}
		System.out.println();
	}
	
	
	/* Cleans the data by removing from temperatures all values that are less than
	   lower and all values that are greater than upper, as described in part (a)
	*/
	public void cleanData(double lower, double upper) {
		/* to be implemented in part (a) */
		for(int i = 0; i<temperatures.size()-1; i++){
			if(temperatures.get(i) < lower || temperatures.get(i) > upper){
				temperatures.remove(i);
				i--;
			}
		}
	}
	
	
	/* Returns the length of the longest heat wave found in temperatures, as described in    
	   part (b).
	   Precondition: There is at least one heat wave in temperatures based on threshold.
	*/
	public int longestHeatWave(double threshold) {
		/* to be implemented in part (b) */
		int length = 0;
		for(int i = 0; i<temperatures.size()-1; i++){
			int heatLength = 0;
			for(int j = i; j<temperatures.size()-1; j++){
				if(temperatures.get(j) >= threshold){
					heatLength++;
				}else{
					break;
				}
			}
			if(heatLength > length){
				length = heatLength;
			}
		}
		return length;
	}
}